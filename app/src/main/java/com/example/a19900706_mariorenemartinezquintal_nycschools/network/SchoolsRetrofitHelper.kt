package com.example.a19900706_mariorenemartinezquintal_nycschools.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SchoolsRetrofitHelper {
val BASE_URL = "https://data.cityofnewyork.us/"

        fun getInstance(): Retrofit {

                return Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }

    }




