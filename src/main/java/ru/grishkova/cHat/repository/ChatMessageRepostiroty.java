package ru.grishkova.cHat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grishkova.cHat.model.ChatMessage;

public interface ChatMessageRepostiroty extends JpaRepository<ChatMessage, Long> {
}
