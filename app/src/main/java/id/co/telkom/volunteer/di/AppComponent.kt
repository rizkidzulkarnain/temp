package id.co.telkom.volunteer.di

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import id.co.telkom.commons.base.BaseViewModelContract
import id.co.telkom.volunteer.GITSApplication
import id.co.telkom.volunteer.base.BaseActivity
import id.co.telkom.volunteer.base.BaseAppCompatActivity
import id.co.telkom.volunteer.feature.login.LoginActivity
import id.co.telkom.volunteer.feature.login.LoginModule

//@Component(modules = [LoginModule::class])
@Component(modules = [AndroidInjectionModule::class, ActivityBuilder::class])
interface AppComponent {
    fun inject(loginActivity: LoginActivity)

    /*sampai sini yang tambahan*/
    fun inject(baseAppCompatActivity: BaseAppCompatActivity)
    fun inject(app: GITSApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}