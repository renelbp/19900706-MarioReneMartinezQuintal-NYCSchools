package com.example.a19900706_mariorenemartinezquintal_nycschools

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a19900706_mariorenemartinezquintal_nycschools.databinding.SchoolListItemBinding
import com.example.a19900706_mariorenemartinezquintal_nycschools.schools.School

class SchoolsListAdapter(
    private var schoolsList: List<School>
    ): RecyclerView.Adapter<SchoolsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolsListViewHolder {
        val binding = SchoolListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SchoolsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SchoolsListViewHolder, position: Int) {
        with(holder){
            with(schoolsList[position]){
                binding.tvSchoolName.text = this.school_name
                binding.tvCityName.text = this.city
            }
        }

    }

    override fun getItemCount(): Int {
        return schoolsList.size
    }
}

class SchoolsListViewHolder(
    val binding: SchoolListItemBinding
    ): RecyclerView.ViewHolder(binding.root)
