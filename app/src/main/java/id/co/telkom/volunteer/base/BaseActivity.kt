package id.co.telkom.volunteer.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import id.co.telkom.commons.base.BaseViewModelContract
import id.co.telkom.volunteer.GITSApplication
import id.co.telkom.volunteer.di.DaggerAppComponent

abstract class BaseActivity<out T : ViewDataBinding, out V : BaseViewModelContract>
    : BaseAppCompatActivity() {
    private lateinit var viewDataBinding: T
    private lateinit var viewModel: V

    /**
     * override for set binding variable
     *
     * @return variable id
     */
    abstract fun getBindingVariable(): Int

    /**
     * override for set view model provider
     *
     * @return view model provider
     */
    abstract fun getViewModelProvider(): V

    /**
     * override for get layout id resource
     *
     * @return layout resource type int
     */
    @LayoutRes
    abstract fun getLayoutId():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    private fun performDataBinding(){
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
        viewDataBinding.setVariable(getBindingVariable(), getViewModelProvider())
        viewDataBinding.executePendingBindings()
    }
}