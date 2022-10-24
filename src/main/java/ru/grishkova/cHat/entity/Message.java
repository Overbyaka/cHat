package ru.grishkova.cHat.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "message")
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 65535)
    @Type(type = "text")
    private String message;

    private String from;
    private String whom;
}
