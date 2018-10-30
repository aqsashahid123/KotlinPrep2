package com.example.onebyte.kotlinprep.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class User {
    @SerializedName("_id")
    @Expose
    private var id: String? = null
    @SerializedName("age")
    @Expose
    private var age: String? = null
    @SerializedName("area")
    @Expose
    private var area: String? = null
    @SerializedName("dateOfBirth")
    @Expose
    private var dateOfBirth: String? = null
    @SerializedName("deviceId")
    @Expose
    private var deviceId: String? = null
    @SerializedName("deviceType")
    @Expose
    private var deviceType: String? = null
    @SerializedName("email")
    @Expose
    private var email: String? = null
    @SerializedName("fullName")
    @Expose
    private var fullName: String? = null
    @SerializedName("gender")
    @Expose
    private var gender: String? = null
    @SerializedName("mobileNumber")
    @Expose
    private var mobileNumber: String? = null
    @SerializedName("registrationType")
    @Expose
    private var registrationType: String? = null
    @SerializedName("profileImage")
    @Expose
    private var profileImage: String? = null
    @SerializedName("token")
    @Expose
    private var token: String? = null

}