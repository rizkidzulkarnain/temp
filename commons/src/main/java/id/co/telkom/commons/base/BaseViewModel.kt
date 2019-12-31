package id.co.telkom.commons.base

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope, BaseViewModelContract {
    private val isLoading = ObservableBoolean(false)
    private val compositeDisposable = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = compositeDisposable

    override fun onCleared() {
        try {
            compositeDisposable.cancel()
        } catch (e: Throwable) {
        }
        super.onCleared()
    }

    override fun getCompositeDisposable() = compositeDisposable

    override fun getIsLoading() = isLoading

    override fun setIsLoading(isLoading: Boolean) {
        this.isLoading.set(isLoading)
    }
}