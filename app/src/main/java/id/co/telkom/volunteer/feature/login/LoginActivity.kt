package id.co.telkom.volunteer.feature.login

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import id.co.telkom.commons.feature.login.LoginViewModel
import id.co.telkom.commons.feature.login.LoginViewModelContract
import id.co.telkom.volunteer.BR
import id.co.telkom.volunteer.GITSApplication
import id.co.telkom.volunteer.R
import id.co.telkom.volunteer.base.BaseActivity
import id.co.telkom.volunteer.databinding.ActivityLoginBinding
import id.co.telkom.volunteer.di.DaggerAppComponent
import javax.inject.Inject

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModelContract>(){

    private lateinit var binding: ActivityLoginBinding

    @Inject
    lateinit var viewModelFactory : ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        //DaggerAppComponent.create().inject(this)
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView(){
    }

    override fun getBindingVariable() = BR.viewModel

    override fun getViewModelProvider() = ViewModelProviders.of(this, viewModelFactory)
        .get(LoginViewModel::class.java)

   /* override fun getViewModelProvider(): LoginViewModelContract {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }*/

    override fun getLayoutId() = R.layout.activity_login
}
