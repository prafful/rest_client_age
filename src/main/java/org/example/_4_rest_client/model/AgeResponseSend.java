package org.example._4_rest_client.model;

public class AgeResponseSend {
    private String name;
    private Integer age;
    private Integer count;
    private String date;

    public AgeResponseSend(String name, Integer age, Integer count, String date) {
        this.name = name;
        this.age = age;
        this.count = count;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AgeResponseSend() {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
