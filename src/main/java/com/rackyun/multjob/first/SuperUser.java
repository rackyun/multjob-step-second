package com.rackyun.multjob.first;

import com.rackyun.multjob.main.User;

/**
 * @author yunhai.hu
 * @date 2018/9/30
 */
public class SuperUser extends User {

    private String superPower;

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "superPower='" + superPower + '\'' +
                "} " + super.toString();
    }
}
