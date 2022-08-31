package com.nttdata.bootcamp.bank.springboot.dao.inte;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CardDaoInte extends ReactiveMongoRepository<Card, String> {
    Mono<Card> readByCodeCard(String codeCard);
}
