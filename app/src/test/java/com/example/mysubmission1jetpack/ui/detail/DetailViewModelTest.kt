package com.example.mysubmission1jetpack.ui.detail

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
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvshow = DataDummy.generateDummyTvshow()[0]
    private val movieId = dummyMovie.movieId
    private val tvshowId = dummyTvshow.movieId

    @get:Rule
    var InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var filmObserver: Observer<in Entity>

    @Before
    fun setUp(){
        viewModel = DetailViewModel(filmRepository)
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedMovie(tvshowId)
    }

    @Test
    fun testGetMovie() {
        val movie = MutableLiveData<Entity>()
        movie.value = dummyMovie

        `when`(filmRepository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntity = viewModel.getMovie().value as Entity
        verify(filmRepository).getDetailMovie(movieId)
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.imagePath, movieEntity.imagePath)

        viewModel.getMovie().observeForever(filmObserver)
        verify(filmObserver).onChanged(dummyMovie)

    }

    @Test
    fun testGetTvshow() {
        val tvshow = MutableLiveData<Entity>()
        tvshow.value = dummyTvshow

        `when`(filmRepository.getDetailTvshow(tvshowId)).thenReturn(tvshow)
        viewModel.setSelectedMovie(dummyTvshow.movieId)
        val tvshowEntity = viewModel.getTvshow().value as Entity
        verify(filmRepository).getDetailTvshow(tvshowId)
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.movieId, tvshowEntity.movieId)
        assertEquals(dummyTvshow.title, tvshowEntity.title)
        assertEquals(dummyTvshow.description, tvshowEntity.description)
        assertEquals(dummyTvshow.release, tvshowEntity.release)
        assertEquals(dummyTvshow.imagePath, tvshowEntity.imagePath)

        viewModel.getTvshow().observeForever(filmObserver)
        verify(filmObserver).onChanged(dummyTvshow)
    }
}