package com.sirius.botasky.databindingdemo.ui;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by botasky on 30/12/2016.
 */

public abstract class SimpleWatcher implements TextWatcher{
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //后面传入去实现设值到需要的地方
        onTextChanged(s.toString());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    public abstract void onTextChanged(String s);
}
