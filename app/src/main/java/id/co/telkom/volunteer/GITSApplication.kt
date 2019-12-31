package id.co.telkom.volunteer

import android.app.Activity
import androidx.multidex.MultiDexApplication
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import id.co.telkom.volunteer.di.AppComponent
import id.co.telkom.volunteer.di.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by Rizki Dzulkarnain on 12/31/2019.
 */
class GITSApplication : MultiDexApplication(), HasActivityInjector {
    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    lateinit var appComponent: AppComponent

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        setupDagger()
    }

    private fun setupDagger() {
        appComponent = DaggerAppComponent.builder().application(this).build()
        getComponent().inject(this)
    }

    private fun getComponent():AppComponent {
        return appComponent
    }
}