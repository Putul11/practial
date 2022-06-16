package com.putul.springboot.web.model;

import javax.validation.constraints.Size;
import java.util.Date;

public class Todo {
    private int id;
    private String user;

@Size(min = 10,message="Enter at least 10 character")
    private String course;
    private Date targetDate;
    private boolean isDone;

    public Todo(){
        super();
    }

    public Todo(int id, String user, String course, Date targetDate, boolean isDone){

        super();
        this.id = id;
        this.user = user;
        this.course = course;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
       this.isDone = done;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Todo other = (Todo) obj;
        if(id != other.id){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo [id=%s, user=%s, course=%s, targetDate=%s, isDone=%s]", id,
                user, course, targetDate, isDone);
    }
}
