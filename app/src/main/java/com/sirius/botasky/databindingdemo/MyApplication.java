package com.sirius.botasky.databindingdemo;

import android.app.Application;


import com.sirius.botasky.databindingdemo.dagger.module.AppModule;
import com.sirius.botasky.databindingdemo.entity.DaggerRepositoryComponent;
import com.sirius.botasky.databindingdemo.entity.RepositoryComponent;


/**
 * Created by botasky on 28/12/2016.
 */
public class MyApplication extends Application {
    private RepositoryComponent mRepositoryComponent;

    public static MyApplication mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
        mInstance = this;
    }

    private void initComponent() {
        mRepositoryComponent = DaggerRepositoryComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static MyApplication getInstance() {
        return mInstance;
    }

    public RepositoryComponent getRepositoryComponent(){
        return mRepositoryComponent;
    }
}
