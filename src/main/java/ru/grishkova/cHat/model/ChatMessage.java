package ru.grishkova.cHat.model;

import lombok.Data;

import javax.persistence.*;
import javax.print.DocFlavor;
import java.util.Date;

@Data
@Entity
@Table(name="messages")
public class ChatMessage {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(value=EnumType.STRING)
    @Column(name="type")
    private MessageType type;
    @Column(name="content")
    private String content;
    @Column(name="sender")
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }
}