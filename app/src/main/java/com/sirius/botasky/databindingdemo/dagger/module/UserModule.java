package com.sirius.botasky.databindingdemo.dagger.module;

import android.util.Log;

import com.sirius.botasky.databindingdemo.MyApplication;
import com.sirius.botasky.databindingdemo.R;
import com.sirius.botasky.databindingdemo.entity.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by botasky on 28/12/2016.
 */

@Module
public class UserModule {
//    @Provides
//    public User provideUser(){
//        return new User("RootUser");
//    }

//    @Provides
//    public User providername(User user){
//        return user.getName();
//    }

//    @Provides
//    public String provideString(User user){
//        return user.getName();
//    }


//    @Provides
//    public String provideName(MyApplication application){
//        Log.e("Name" , " " + application.getPackageName());
//        return application.getPackageName();
//    }
    @Singleton
    @Provides
    public User provideUser(){
        return new User("RootUser");
    }
}
