package com.kanti.attendancemanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Faculty {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user_name;
    private String name;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Faculty(int id, String user_name, String name, String password) {
        super();
        this.id = id;
        this.user_name = user_name;
        this.name = name;
        this.password = password;
    }
    public Faculty() {
        super();
    }

    
    
}
