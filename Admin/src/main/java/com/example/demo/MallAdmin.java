package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "mall_admin")
public class MallAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String mall;
    @Column
    private String phone;

    // Default constructor
    public MallAdmin() {
    }

    // Parameterized constructor
    public MallAdmin(Long id, String name, String password, String mall, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mall = mall;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
