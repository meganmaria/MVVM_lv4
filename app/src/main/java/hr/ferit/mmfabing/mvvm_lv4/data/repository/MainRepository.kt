package hr.ferit.mmfabing.mvvm_lv4.data.repository

import hr.ferit.mmfabing.mvvm_lv4.data.api.ApiHelper
import hr.ferit.mmfabing.mvvm_lv4.data.model.User
import io.reactivex.Single

class MainRepository (private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}