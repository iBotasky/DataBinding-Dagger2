package com.sirius.botasky.databindingdemo.entity;

import com.sirius.botasky.databindingdemo.BR;


/**
 * Created by botasky on 26/12/2016.
 */

public class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
