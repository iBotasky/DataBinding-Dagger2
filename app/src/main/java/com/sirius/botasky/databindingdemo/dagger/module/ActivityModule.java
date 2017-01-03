package com.sirius.botasky.databindingdemo.dagger.module;

import android.app.Activity;

import com.sirius.botasky.databindingdemo.MyApplication;
import com.sirius.botasky.databindingdemo.dagger.qualifiter.ForApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by botasky on 28/12/2016.
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }


    @Provides
    public Activity provodeActivity(){
        return activity;
    }

    @Provides
    public String providename(@ForApplication MyApplication application){
        return application.getPackageName();
    }

}
