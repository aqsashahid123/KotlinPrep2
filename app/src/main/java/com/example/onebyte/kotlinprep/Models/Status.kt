package com.example.onebyte.kotlinprep.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Status {
    @SerializedName("message")
    @Expose
    private var message: String? = null
    @SerializedName("code")
    @Expose
    private var code: Int? = null

}