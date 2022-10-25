package ru.grishkova.cHat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.grishkova.cHat.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
