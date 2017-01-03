package com.sirius.botasky.databindingdemo.continer;

/**
 * Created by botasky on 28/12/2016.
 */

public class Continer {
    private String key;
    private String value;

    public Continer(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
