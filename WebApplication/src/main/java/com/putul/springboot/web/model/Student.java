package com.putul.springboot.web.model;

import java.util.Date;


public class Student {
    private int id;
    private String firstName;
    private String lastname;
    private Date dob;
    private String phoneNo;



    public Student(int id, String firstName, String lastname, Date dob, String phoneNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }
}
