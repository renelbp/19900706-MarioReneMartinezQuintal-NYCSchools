package com.example.a19900706_mariorenemartinezquintal_nycschools.schools

import com.example.a19900706_mariorenemartinezquintal_nycschools.network.SchoolsListApi
import com.example.a19900706_mariorenemartinezquintal_nycschools.network.SchoolsRetrofitHelper

class SchoolRepository  (){

    val schoolsListApi = SchoolsRetrofitHelper
        .getInstance()
        .create(SchoolsListApi::class.java)


    suspend fun getSchoolsList(): List<School> {
/*        val listResponse = schoolsListApi.getSchoolsList()
         val listOfSchools =listResponse.body()*/
        val listResponse = schoolsListApi.getSchoolsList()
        return listResponse
    }



}
