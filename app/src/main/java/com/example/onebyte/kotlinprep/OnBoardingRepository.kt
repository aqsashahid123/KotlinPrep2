package com.example.onebyte.kotlinprep

import android.databinding.adapters.NumberPickerBindingAdapter.setValue
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.LiveData
import android.util.Log
import com.example.onebyte.kotlinprep.Models.RootUserModel
import com.example.onebyte.kotlinprep.Models.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OnBoardingRepository  {
    var mAPIService: APIService? = null
    constructor() {
        mAPIService = ApiUtils.apiService
    }
    fun getHeadLine(): User {
        var data = User()
//        var mAPIService: APIService? = null

        mAPIService = ApiUtils.apiService
        mAPIService?.registrationPost("asd@asd.com", "qwerty1+A")?.enqueue(object : Callback<RootUserModel> {
            override fun onResponse(call: Call<RootUserModel>, response: Response<RootUserModel>) {
                Log.i("resp", "post submitted to API." + response.body()!!)
                if (response.isSuccessful()) {
                    data = response.body()!!.user!!
                    Log.i("", "post registration to API" + response.body()!!.toString())
                }
            }
            override fun onFailure(call: Call<RootUserModel>, t: Throwable) {
                Log.e("Resp", t.message)
            }
        })
        return data
    }
}