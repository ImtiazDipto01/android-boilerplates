package com.imtiaz.androidboilerplates.di.module

import com.imtiaz.androidboilerplates.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun provideMainActivity() : MainActivity
}