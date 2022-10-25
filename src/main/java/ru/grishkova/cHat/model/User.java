package ru.grishkova.cHat.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;
    @Column(name ="password")
    private String password;
    @Enumerated(value = EnumType.STRING)
    @Column(name ="role")
    private Role role;
    @Enumerated(value = EnumType.STRING)
    @Column(name ="status")
    private Status status;
}
