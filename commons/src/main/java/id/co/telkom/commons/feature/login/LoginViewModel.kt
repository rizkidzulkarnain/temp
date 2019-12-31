package id.co.telkom.commons.feature.login

import id.co.telkom.commons.base.BaseViewModel

class LoginViewModel(val interactor: LoginInteractorContract) : BaseViewModel(),
    LoginViewModelContract {

    companion object{
        const val VIEW_MODEL_PROVIDER = "LoginViewModelProvider"
    }
}