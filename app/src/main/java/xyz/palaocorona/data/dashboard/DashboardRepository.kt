package xyz.palaocorona.data.dashboard

import io.reactivex.Single

interface DashboardRepository {
    
    fun isUserLoggedIn(): Boolean
    
    fun getSliderImages(): Single<MutableList<String>>
    
    fun isInternetAvailable(): Boolean
}