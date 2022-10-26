package ru.grishkova.cHat.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }
}