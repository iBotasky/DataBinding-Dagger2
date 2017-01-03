package com.sirius.botasky.databindingdemo.entity;

import android.app.Application;

import com.sirius.botasky.databindingdemo.dagger.qualifiter.ForApplication;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by botasky on 28/12/2016.
 */
@Singleton
public class Repository {

    private final User user;

    private final Application application;

    @Inject
    Repository(User user, @ForApplication Application application) {
        this.user = user;
        this.application = application;
    }

    public User getUser() {
        return user;
    }

    public Application getApplication() {
        return application;
    }
}
