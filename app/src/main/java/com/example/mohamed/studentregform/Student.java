package com.example.mohamed.studentregform;

import java.io.Serializable;

/**
 * Created by mohamed on 12/20/16.
 */

public class Student implements Serializable{
    private String name;
    private String email;
    private String department;
    private String state;
    private int mood;

    Student() {

    }

    Student(String name, String email, String department, String state, int mood){
        this.name = name;
        this.email = email;
        this.department = department;
        this.state = state;
        this.mood = mood;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
