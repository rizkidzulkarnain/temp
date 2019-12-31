package id.co.telkom.commons.base

import androidx.databinding.Observable
import androidx.databinding.ObservableBoolean
import kotlinx.coroutines.Job

interface BaseViewModelContract {
    fun getCompositeDisposable(): Job

    fun getIsLoading(): ObservableBoolean

    fun setIsLoading(isLoading: Boolean)
}