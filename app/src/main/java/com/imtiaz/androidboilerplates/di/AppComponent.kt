package com.imtiaz.androidboilerplates.di

import android.app.Application
import com.imtiaz.androidboilerplates.App
import com.imtiaz.androidboilerplates.di.module.ActivityBuilderModule
import com.imtiaz.androidboilerplates.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : Application) : Builder

        fun build() : AppComponent
    }

    fun inject(app: App)
}