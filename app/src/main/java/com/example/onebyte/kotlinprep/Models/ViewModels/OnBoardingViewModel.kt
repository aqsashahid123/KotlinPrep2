package com.example.onebyte.kotlinprep.Models.ViewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.LiveData
import android.app.Application
import android.support.annotation.NonNull
import android.databinding.ObservableField
import android.databinding.adapters.NumberPickerBindingAdapter.setValue
import android.arch.lifecycle.MutableLiveData
import com.example.onebyte.kotlinprep.Models.RootUserModel
import com.example.onebyte.kotlinprep.Models.User
import com.example.onebyte.kotlinprep.OnBoardingRepository


class OnBoardingViewModel : ViewModel() {
    private val onBoardingRepo: OnBoardingRepository? = null


    val email = ObservableField<String?>()
    val fullName = ObservableField<String?>()
    var user :LiveData<User> = rootUser
    // fun loginUser() = onBoardingRepo.getHeadLine()


    private lateinit var rootUser: LiveData<User>
    private lateinit var repo: OnBoardingRepository

    fun OnBoardingViewModel() {


        repo = OnBoardingRepository()
        rootUser = repo.getHeadLine()

    }
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