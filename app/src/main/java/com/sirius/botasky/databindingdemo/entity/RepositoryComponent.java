package com.sirius.botasky.databindingdemo.entity;

import com.sirius.botasky.databindingdemo.MyApplication;
import com.sirius.botasky.databindingdemo.dagger.component.ActivityComponent;
import com.sirius.botasky.databindingdemo.dagger.module.AppModule;
import com.sirius.botasky.databindingdemo.dagger.module.UserModule;
import com.sirius.botasky.databindingdemo.dagger.qualifiter.ForApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by botasky on 28/12/2016.
 */
@Singleton
@Component(modules = {AppModule.class, UserModule.class})
public interface RepositoryComponent {
    /**
    //下层的依赖需要用到就要返回 dependenciuce, 但是如果定义的是@SubComponent就不用这样暴露需要给下层依赖的接口
    //    User getUser();
    //
    //    @ForApplication
    //    MyApplication getApplication();
    **/
    ActivityComponent activityComponent();
}
