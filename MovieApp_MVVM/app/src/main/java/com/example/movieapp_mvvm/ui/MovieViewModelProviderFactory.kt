package com.example.movieapp_mvvm.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp_mvvm.repository.MovieRepository

class MovieViewModelProviderFactory(
    val app: Application,
    val movieRepository: MovieRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(app, movieRepository) as T
    }
}