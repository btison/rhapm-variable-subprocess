package com.redhat.btison.rhpam;

import java.io.Serializable;

public class PersistentObject  implements Serializable {

    private String value;

    public PersistentObject() {

    }

    public PersistentObject(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
