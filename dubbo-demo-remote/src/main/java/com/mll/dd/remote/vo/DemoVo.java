package com.mll.dd.remote.vo;

import java.io.Serializable;

/**
 * Created by rocky on 15/11/27.
 */
public class DemoVo implements Serializable {

    private String name ;

    private int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
