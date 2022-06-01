package com.emre.weather.api

import com.emre.weather.model.WeatherModel
import com.emre.weather.util.Constants.API_KEY
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/forecast")
    fun getData(
        @Query("q")
        cityName: String = "adana",
        @Query("units")
        unitName: String = "metric",
        @Query("lang")
        language: String = "tr",
        @Query("appid")
        apiKey: String = API_KEY
    ): Call<WeatherModel>
}