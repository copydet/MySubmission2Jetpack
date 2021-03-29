package com.example.mysubmission1jetpack.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.mysubmission1jetpack.data.source.remote.RemoteDataSource
import com.example.mysubmission1jetpack.ui.repository.FakeFilmRepository
import com.example.mysubmission1jetpack.utils.DataDummy
import com.example.mysubmission1jetpack.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.verify
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull

import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock

class FilmRepositoryTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val filmRepository = FakeFilmRepository(remote)

    private val movieResponse = DataDummy.generateRemoteDummyMovie()
    private val tvshowResponse = DataDummy.generateRemoteDummyTvshow()
    private val movieId = movieResponse[0].id
    private val tvshowId = tvshowResponse[0].id

    @Test
    fun getAllMovie(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                    .onAllMovieReceived(movieResponse)
            null
        }.`when`(remote).getAllMovie(any())
        val movieEntities = LiveDataTestUtil.getValue(filmRepository.getAllMovie())
        verify(remote).getAllMovie(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponse.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllTvShow(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowCallback)
                    .onAllTvShowReceived(tvshowResponse)
            null
        }.`when`(remote).getAllTvshow(any())
        val tvshowEntities = LiveDataTestUtil.getValue(filmRepository.getAllTvShow())
        verify(remote).getAllTvshow(any())
        assertNotNull(tvshowEntities)
        assertEquals(tvshowResponse.size.toLong(), tvshowEntities.size.toLong())
    }

    @Test
    fun getDetailMovie(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                    .onAllMovieReceived(movieResponse)
            null
        }.`when`(remote).getAllMovie(any())

        val detailMovieEntities = LiveDataTestUtil.getValue(filmRepository.getDetailMovie(movieId))
        verify(remote).getAllMovie(any())

        assertNotNull(detailMovieEntities)
        assertNotNull(detailMovieEntities.title)
        assertEquals(movieResponse[0].title,detailMovieEntities.title)
    }

    @Test
    fun getDetailTvShow(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowCallback)
                    .onAllTvShowReceived(tvshowResponse)
            null
        }.`when`(remote).getAllTvshow(any())

        val detailTvShowEntities = LiveDataTestUtil.getValue(filmRepository.getDetailTvshow(tvshowId))
        verify(remote).getAllTvshow(any())

        assertNotNull(detailTvShowEntities)
        assertNotNull(detailTvShowEntities.title)
        assertEquals(tvshowResponse[0].title, detailTvShowEntities.title)
    }
}