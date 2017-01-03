package com.sirius.botasky.databindingdemo.dagger.module;

import android.app.Application;
import android.content.Context;

import com.sirius.botasky.databindingdemo.MyApplication;
import com.sirius.botasky.databindingdemo.dagger.qualifiter.ForApplication;
import com.sirius.botasky.databindingdemo.entity.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by botasky on 28/12/2016.
 */

@Module
public final class AppModule {
    private  final MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }


    @Provides
    @Singleton
    @ForApplication
    public Application provideApplication(){
        return this.application;
    }

    @Provides
    @Singleton
    @ForApplication
    public MyApplication provideApp(){
        return this.application;
    }

    @Provides
    @Singleton
    @ForApplication
    public Context provideContext(){
        return this.application.getApplicationContext();
    }


}
