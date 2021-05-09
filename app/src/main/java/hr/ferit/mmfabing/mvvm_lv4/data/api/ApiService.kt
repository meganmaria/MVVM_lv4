package hr.ferit.mmfabing.mvvm_lv4.data.api

import hr.ferit.mmfabing.mvvm_lv4.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}