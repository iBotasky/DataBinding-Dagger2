package com.sirius.botasky.databindingdemo;

import android.util.Log;

import com.sirius.botasky.databindingdemo.entity.User;

import javax.inject.Inject;

/**
 * Created by botasky on 29/12/2016.
 */

public class MainPresenter {

    private final User user;

    @Inject
    public MainPresenter(User user) {
        this.user = user;
    }

    public String getUserName(){
        Log.e("Name", " " + user.getName());
        return user.getName();
    }
}
