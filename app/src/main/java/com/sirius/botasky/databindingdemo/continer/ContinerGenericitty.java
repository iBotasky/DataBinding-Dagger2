package com.sirius.botasky.databindingdemo.continer;

/**
 * Created by botasky on 28/12/2016.
 */

public class ContinerGenericitty<K,V> {
    private K key;
    private V value;

    public ContinerGenericitty(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
