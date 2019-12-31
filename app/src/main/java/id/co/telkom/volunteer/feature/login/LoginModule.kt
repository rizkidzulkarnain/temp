package id.co.telkom.volunteer.feature.login

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import id.co.telkom.commons.feature.login.LoginInteractor
import id.co.telkom.commons.feature.login.LoginInteractorContract
import id.co.telkom.commons.feature.login.LoginViewModel
import id.co.telkom.commons.repository.MainRepositoryContract
import id.co.telkom.volunteer.di.ViewModelProviderFactory

@Module
class LoginModule {
    @Provides
    fun provideLoginInteractor(): LoginInteractorContract {
        return LoginInteractor()
    }

    @Provides
    fun provideLoginViewModel(interactorContract: LoginInteractorContract) : LoginViewModel {
        return LoginViewModel(interactorContract)
    }

    @Provides
    fun registerLoginViewModelProvider(viewModel: LoginViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(viewModel)
    }
}