package com.kotlin.project.dogAndCat.di

import com.kotlin.project.dogAndCat.MyApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class AppModule {
    @App
    @Provides
    fun provideContext(application: MyApplication): MyApplication {
        return application
    }
}
