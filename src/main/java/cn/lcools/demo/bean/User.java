package cn.lcools.demo.bean;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @ClassName: User
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2019/8/22 15:37
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/8/22     liushuai3           v1.0.0               修改原因
 */
public class User {

    private Integer id;


    private String userName;


    private String password;


    private Integer age;


    public Integer getId() {

        return id;

    }


    public void setId(Integer id) {

        this.id = id;

    }


    public String getUserName() {

        return userName;

    }


    public void setUserName(String userName) {

        this.userName = userName == null ? null : userName.trim();

    }


    public String getPassword() {

        return password;

    }


    public void setPassword(String password) {

        this.password = password == null ? null : password.trim();

    }


    public Integer getAge() {

        return age;

    }


    public void setAge(Integer age) {

        this.age = age;

    }


    @Override

    public String toString() {

        return "User [id=" + id + ", userName=" + userName + ", password="

                + password + ", age=" + age + "]";

    }


}
