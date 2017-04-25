package com.fengxc.vo;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/4/24.
 */
public class UserVO implements Serializable{

    private Long userId;

    private String name;

    private Integer age;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
