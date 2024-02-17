package com.tvquran.tvquranapp2.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tvquran.tvquranapp2.network.RetrofitInstance

class HomeViewModel : ViewModel() {
    val homeData = liveData {
        val response = RetrofitInstance.apiService.getHomeData()
        if (response.isSuccessful) {
            emit(response.body())
        } else {
            // Handle error
        }
    }
}