package com.example.onebyte.kotlinprep

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


import com.example.onebyte.kotlinprep.Models.RootUserModel
import com.example.onebyte.kotlinprep.Models.User
import com.example.onebyte.kotlinprep.Models.ViewModels.OnBoardingViewModel
import com.example.onebyte.kotlinprep.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
                .apply {
                    this.setLifecycleOwner(this@MainActivity)
                    this
                }
        val mainViewModel = ViewModelProviders.of(this).get(OnBoardingViewModel::class.java)
        var user:LiveData<User>  = mainViewModel.OnBoardingViewModel()
        //binding.etEmail.setText(user.hasObservers().)
//        https@ //github.com/qichuan/mvvm_kotlin
        //  binding.loginViewModel = mainViewModel.user
        binding.notifyChange()
        binding.executePendingBindings()
    }

    private fun sendCall() {
        var mAPIService: APIService? = null

        mAPIService = ApiUtils.apiService
        mAPIService!!.registrationPost("asd@asd.com", "qwerty1+A").enqueue(object : Callback<RootUserModel> {
            override fun onResponse(call: Call<RootUserModel>, response: Response<RootUserModel>) {
                Log.i("resp", "post submitted to API." + response.body()!!)
                if (response.isSuccessful()) {
                    Log.i("", "post registration to API" + response.body()!!.toString())
                }
            }

            override fun onFailure(call: Call<RootUserModel>, t: Throwable) {
                Log.e("Resp", t.message)
            }
        })
    }
}
