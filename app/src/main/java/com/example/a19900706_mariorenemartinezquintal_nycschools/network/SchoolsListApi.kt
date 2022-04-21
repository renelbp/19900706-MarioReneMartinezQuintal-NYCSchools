package com.example.a19900706_mariorenemartinezquintal_nycschools.network

import com.example.a19900706_mariorenemartinezquintal_nycschools.schools.School
import retrofit2.Response
import retrofit2.http.GET

interface SchoolsListApi {
    @GET("resource/s3k6-pzi2.json")
    suspend fun getSchoolsList() : List<School>
}