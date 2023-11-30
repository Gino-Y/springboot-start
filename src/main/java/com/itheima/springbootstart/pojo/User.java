package com.itheima.springbootstart.pojo;

public class User {

    // 定义id属性
    private Integer id;
    // 定义name属性
    private String name;
    // 定义age属性
    private Short age;
    // 定义gender属性
    private Short gender;

    // 构造函数
    public User() {
    }

    // 构造函数，传入id，name，age，gender，phone参数
    public User(Integer id, String name, Short age, Short gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    // 获取id属性
    public Integer getId() {
        return id;
    }

    // 设置id属性
    public void setId(Integer id) {
        this.id = id;
    }

    // 获取name属性
    public String getName() {
        return name;
    }

    // 设置name属性
    public void setName(String name) {
        this.name = name;
    }

    // 获取age属性
    public Short getAge() {
        return age;
    }

    // 设置age属性
    public void setAge(Short age) {
        this.age = age;
    }

    // 获取gender属性
    public Short getGender() {
        return gender;
    }

    // 设置gender属性
    public void setGender(Short gender) {
        this.gender = gender;
    }

    // 获取phone属性
    public String getPhone() {
        return phone;
    }

    // 设置phone属性
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 定义phone属性
    private String phone;
}