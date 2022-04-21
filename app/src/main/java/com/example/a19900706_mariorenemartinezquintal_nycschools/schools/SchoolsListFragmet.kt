package com.example.a19900706_mariorenemartinezquintal_nycschools.schools

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a19900706_mariorenemartinezquintal_nycschools.SchoolsListAdapter
import com.example.a19900706_mariorenemartinezquintal_nycschools.databinding.FragmentSchoolListBinding
import com.example.a19900706_mariorenemartinezquintal_nycschools.network.SchoolsListApi
import com.example.a19900706_mariorenemartinezquintal_nycschools.network.SchoolsRetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SchoolsListFragmet : Fragment() {
    private val TAG = "MAIN_ACTIVITY"
    private lateinit var binding: FragmentSchoolListBinding

    val viewModel by viewModels<SchoolListViewModel> {
        VMFactory(SchoolRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSchoolListBinding.inflate(inflater,container,false)
       // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.fetchSchoolsList()
        viewModel.schoolListLiveData.observe(viewLifecycleOwner, Observer {
            binding.recyclerview.adapter = SchoolsListAdapter(it)
        })




       }

}