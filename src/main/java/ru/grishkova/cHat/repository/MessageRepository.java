package ru.grishkova.cHat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.grishkova.cHat.entity.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
