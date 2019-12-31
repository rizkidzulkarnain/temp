package id.co.telkom.volunteer.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.co.telkom.volunteer.feature.login.LoginActivity
import id.co.telkom.volunteer.feature.login.LoginModule

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun bindLoginActivity(): LoginActivity
}