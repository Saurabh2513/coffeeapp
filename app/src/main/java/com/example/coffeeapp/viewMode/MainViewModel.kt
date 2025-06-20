package com.example.coffeeapp.viewMode

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.coffeeapp.activity.domain.BannerModel
import com.example.coffeeapp.repo.MainRepo

class MainViewModel : ViewModel() {
    private val repository = MainRepo()

    fun lodBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }

}