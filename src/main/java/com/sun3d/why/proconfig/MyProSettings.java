package com.sun3d.why.proconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xiech on 2018/2/1 0001.
 */
@ConfigurationProperties(prefix = "myPro")
public class MyProSettings {

    private String name;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
