package com.sirius.botasky.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.sirius.botasky.databindingdemo.entity.User;
import com.sirius.botasky.databindingdemo.ui.SimpleWatcher;

import javax.inject.Inject;

/**
 * Created by botasky on 29/12/2016.
 */

public class MainViewModule extends BaseObservable{
    private String moduleName="";

    private  final User user;

    private SimpleWatcher editWatcher = new SimpleWatcher() {
        @Override
        public void onTextChanged(String s) {
            setModuleName(s);
        }
    };


    @Inject
    public MainViewModule(User user) {
        this.user = user;
        this.moduleName = user.getName();

    }

    @Bindable
    public String getModuleName() {
        return moduleName;
    }

    @Bindable
    public User getUser() {
        return user;
    }

    @Bindable
    public SimpleWatcher getEditWatcher() {
        return editWatcher;
    }

    public void setEditWatcher(SimpleWatcher editWatcher) {
        this.editWatcher = editWatcher;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
        notifyPropertyChanged(BR.moduleName);
        notifyPropertyChanged(BR.validable);
    }

    @Bindable
    public boolean getValidable(){
        return !TextUtils.isEmpty(moduleName);
    }
}
