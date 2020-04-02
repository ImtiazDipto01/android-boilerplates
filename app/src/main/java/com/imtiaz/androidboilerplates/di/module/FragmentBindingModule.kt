package com.imtiaz.androidboilerplates.di.module

import com.imtiaz.androidboilerplates.ui.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): MainFragment
}