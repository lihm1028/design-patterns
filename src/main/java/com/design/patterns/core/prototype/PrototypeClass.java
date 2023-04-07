package com.design.patterns.core.prototype;

/**
 * Created by lihongming on 16/6/21.
 */
public class PrototypeClass implements Cloneable {

    @Override
    protected PrototypeClass clone() {

        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
