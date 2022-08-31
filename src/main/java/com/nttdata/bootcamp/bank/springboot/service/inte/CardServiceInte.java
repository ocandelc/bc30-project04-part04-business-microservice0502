package com.nttdata.bootcamp.bank.springboot.service.inte;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CardServiceInte {

    Mono<Card> create(final Card card);

    Flux<Card> readAll();

    Mono<Card> readByCodeCard(String codeCard);

    Mono<Card> updateById(final String id, final Card card);

    Mono<Void> deleteById(final String id);
}