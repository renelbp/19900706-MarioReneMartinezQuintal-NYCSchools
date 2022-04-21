package com.example.a19900706_mariorenemartinezquintal_nycschools.schools

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class SchoolListViewModel(private val repository: SchoolRepository):ViewModel() {
    val schoolListLiveData = MutableLiveData<List<School>>()



       fun fetchSchoolsList() = viewModelScope.launch {
         val schoolsList =  repository.getSchoolsList()
               schoolListLiveData.postValue(schoolsList)
       }

}
