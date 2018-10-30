package com.example.onebyte.kotlinprep.Models.ViewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.LiveData
import android.app.Application
import android.support.annotation.NonNull
import android.databinding.ObservableField
import android.databinding.adapters.NumberPickerBindingAdapter.setValue
import android.arch.lifecycle.MutableLiveData
import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.onebyte.kotlinprep.ApiUtils
import com.example.onebyte.kotlinprep.BR

import com.example.onebyte.kotlinprep.Models.RootUserModel
import com.example.onebyte.kotlinprep.Models.User
import com.example.onebyte.kotlinprep.OnBoardingRepository
import java.util.*


class OnBoardingViewModel() : Observer, BaseObservable() {
   var userr = User()
    constructor( userr:User) : this() {
           this.userr = userr
            }
    init {

        userr.addObserver(this)
    }

    override fun update(p0: Observable?, p1: Any?) {
        if (p1 is String) {
            if (p1 == "email") {
                notifyPropertyChanged(BR.email)
            } else if (p1 == "fullName") {
                notifyPropertyChanged(BR.fullName)
            }
        }
    }
//    val fullName: String
//        @Bindable get() {
//            return userr.fullName
//        }
//
//    val email: String
//        @Bindable get() {
//           return userr.email
//        }

    private val onBoardingRepo: OnBoardingRepository? = null


    val email = ObservableField<String?>()
    val fullName = ObservableField<String?>()
//    var user :LiveData<User> = rootUser
    // fun loginUser() = onBoardingRepo.getHeadLine()

//    val fullName : String = userr.fullName
//    val  email: String = userr.email
  //  private lateinit var rootUser:User
    private lateinit var repo: OnBoardingRepository

    fun OnBoardingViewModel()  {


        repo = OnBoardingRepository()
        userr = repo.getHeadLine()


    }
    fun getUser(): User{
        return userr
    }

//    fun OnBoardingViewModel() : LiveData<User> {
//
//
//        repo = OnBoardingRepository()
//        rootUser = repo.getHeadLine()
//        return rootUser
//
//    }
//    public fun getUser() : LiveData<User>{
//        OnBoardingViewModel()
//        return rootUser
//    }


    // Use LiveData for getting all the data from the database
//    fun getTasks(): LiveData<List<Task>> {
//        return mTasks
//    }


//    private val MUTABLE_LIVE_DATA = MutableLiveData()
////    {
////        MUTABLE_LIVE_DATA.setValue(null);
////    }
//    val project = ObservableField<RootUserModel>()
//
//    fun HeadLineViewModel(headLineRepository: OnBoardingRepository,
//                          application: Application): ??? {
//        super(application)
//        newsResponseObservable = HeadLineRepository.getInstance()
//                .getHeadLine("in", "84a7decf3110498ea372bd16dd0601e8")
//    }
//
//    fun getNewsResponseObservable(): LiveData<NewsResponse> {
//        return newsResponseObservable
//    }
}