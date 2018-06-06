package com.example.jxm.javasample;

/**
 * Created by jiamao on 2018/5/24.
 */

public class ClassA {

    public String name;

    public ClassA(@SuppressWarnings("SameParameterValue") String name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return 103;
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ClassA)){
            return false;
        }
        if (this.name.equals(((ClassA) o).name)){
            return true;
        }
        return false;
    }
}
