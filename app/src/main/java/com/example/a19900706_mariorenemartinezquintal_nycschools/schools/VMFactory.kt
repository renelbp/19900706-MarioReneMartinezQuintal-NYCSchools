package com.example.a19900706_mariorenemartinezquintal_nycschools.schools

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VMFactory(private val repository: SchoolRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(SchoolListViewModel::class.java)) {
            SchoolListViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }    }
}