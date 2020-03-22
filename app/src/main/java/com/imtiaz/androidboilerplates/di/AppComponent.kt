package com.imtiaz.androidboilerplates.di

import android.app.Application
import com.imtiaz.androidboilerplates.di.module.ActivityBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : Application) : Builder

        fun build() : AppComponent
    }
}