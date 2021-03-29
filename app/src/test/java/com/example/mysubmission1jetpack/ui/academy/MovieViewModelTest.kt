package com.example.mysubmission1jetpack.ui.academy


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
class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<Entity>>

    @Before
    fun setUp(){
        viewModel = MovieViewModel(filmRepository)
    }

    @Test
    fun getMovie(){
        val dummyMovie = DataDummy.generateDummyMovie()
        val movies = MutableLiveData<List<Entity>>()
        movies.value = dummyMovie

        `when`(filmRepository.getAllMovie()).thenReturn(movies)
        val movieEntities = viewModel.getMovie().value
        verify(filmRepository).getAllMovie()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }
}