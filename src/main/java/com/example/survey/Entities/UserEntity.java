package com.example.survey.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", nullable = false)
    private Long id;


    @Column(name = "name")
    private String name;


    @Column(name = "surname")
    private String surname;


    @Column(name = "password")
    private String password;


    @Column(name = "email")
    private String email;


    @Column(name = "phone")
    private String phone;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "role")
    private Boolean role;


}