package com.xiao.springbootstudy.pojo;

/**
 * Description:
 * User: xiaojixiang
 * Date: 2017/11/10
 * Version: 1.0
 */

public class UserPojo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {


        this.age = age;
    }

    private void init() {
        System.out.println(this.getClass().getName() + " init()");
    }


    private void destroy() {
        System.out.println(this.getClass().getName() + " destroy()");
    }
}
