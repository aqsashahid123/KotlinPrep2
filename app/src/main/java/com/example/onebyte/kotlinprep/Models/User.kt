package com.example.onebyte.kotlinprep.Models


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*


class User : Observable() {
    @SerializedName("_id")
    @Expose
     var id: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("age")
    @Expose
     var age: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("area")
    @Expose
     var area: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }

    @SerializedName("dateOfBirth")
    @Expose
     var dateOfBirth: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("deviceId")
    @Expose

     var deviceId: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("deviceType")
    @Expose
     var deviceType: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("email")
    @Expose
     var email: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("fullName")
    @Expose
     var fullName: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("gender")
    @Expose
     var gender: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("mobileNumber")
    @Expose
     var mobileNumber: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("registrationType")
    @Expose
     var registrationType: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("profileImage")
    @Expose
    var profileImage: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }
    @SerializedName("token")
    @Expose
     var token: String = ""
        set(value) {
            field = value
            setChangedAndNotify(field)
        }

     fun setChangedAndNotify(field: Any) {
        setChanged()
        notifyObservers(field)
    }
}