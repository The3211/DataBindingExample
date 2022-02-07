package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityDataBindingExampleBinding
import com.example.databindingexample.model.Student

class DataBindingExampleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDataBindingExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_example)
        binding.student = getStudent()
        binding.apply {
            startStopButton.setOnClickListener {
                if(progressBar.visibility == View.GONE){
                    progressBar.visibility = View.VISIBLE
                    startStopButton.text = "Stop"
                }else{
                    progressBar.visibility = View.GONE
                    startStopButton.text = "Start"
                }
            }
        }
    }

    private fun getStudent() : Student{
        return Student(1,"Aiyaz","aiyaz@gmail.com")
    }
}