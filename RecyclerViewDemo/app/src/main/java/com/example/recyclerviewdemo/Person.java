package com.example.recyclerviewdemo;

public class Person {
    private String name;
    private String msv;
    private String email = "Không có thông tin";
    private String jobTitle = "Thành viên nhóm";

    public Person(String name, String msv) {
        this.name = name;
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public String getMsv() {
        return msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
