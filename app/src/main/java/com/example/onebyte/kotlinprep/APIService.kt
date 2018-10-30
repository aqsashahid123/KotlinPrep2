package com.example.onebyte.kotlinprep

import com.example.onebyte.kotlinprep.Models.RootUserModel
import retrofit2.Call

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIService {
    @POST("users/login")
    @FormUrlEncoded
    fun registrationPost(@Field("email") email: String,
                         @Field("password") password: String) : Call<RootUserModel>
}


//**App Utils**

object ApiUtils {

    val BASE_URL = "http://162.243.7.101:4300/api/v1/"

    val apiService: APIService
        get() = RetrofitClient.getClient(BASE_URL)!!.create(APIService::class.java)


}