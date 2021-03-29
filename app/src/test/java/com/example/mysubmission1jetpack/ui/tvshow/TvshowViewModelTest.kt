package com.example.mysubmission1jetpack.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.mysubmission1jetpack.data.source.FilmRepository
import com.example.mysubmission1jetpack.data.source.local.entity.Entity
import com.example.mysubmission1jetpack.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvshowViewModelTest {
    private lateinit var viewModel: TvshowViewModel

    @get:Rule
    var instanTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<Entity>>

    @Before
    fun setUp(){
        viewModel = TvshowViewModel(filmRepository)
    }

    @Test
    fun testGetTvshow() {
        val dummyTvShow = DataDummy.generateDummyTvshow()
        val tvshow = MutableLiveData<List<Entity>>()
        tvshow.value = dummyTvShow

        `when`(filmRepository.getAllTvShow()).thenReturn(tvshow)
        val tvshowEntity = viewModel.getTvshow().value
        verify(filmRepository).getAllTvShow()
        assertNotNull(tvshowEntity)
        assertEquals(10, tvshowEntity?.size)

        viewModel.getTvshow().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}