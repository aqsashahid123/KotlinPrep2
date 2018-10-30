package com.example.onebyte.kotlinprep.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class RootUserModel {
    @SerializedName("status")
     var status: Status? = null
    @SerializedName("user")

     var user: User? = null

}