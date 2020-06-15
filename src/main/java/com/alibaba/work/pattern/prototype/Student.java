package com.alibaba.work.pattern.prototype;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

public class Student implements Cloneable{

    private Integer id;

    private String name;

    private Integer age;

    private String date;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student jsonClone(Student student) {
        // fastJson实现克隆
        Student clone = JSONObject.parseObject(JSONObject.toJSONBytes(student), Student.class);
        return clone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
