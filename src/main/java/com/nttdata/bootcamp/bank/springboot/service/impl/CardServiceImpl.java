package com.nttdata.bootcamp.bank.springboot.service.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.CardDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CardServiceImpl implements CardServiceInte {

    private static final Logger log = LoggerFactory.getLogger(CardServiceInte.class);

    @Autowired
    private CardDaoInte cardDaoInte;

    @Override
    public Mono<Card> create(final Card card) {

        return cardDaoInte.save(card)
                .doFirst(() -> log.info("Begin create Card"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create Card"));
    }

    @Override
    public Flux<Card> readAll() {

        return cardDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll Card"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll Card"));
    }

    @Override
    public Mono<Card> readByCodeCard(String codeCard) {
        return cardDaoInte.readByCodeCard(codeCard)
                .doFirst(() -> log.info("Begin readByCodeCard Card"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readByCodeCard Card"));
    }

    @Override
    public Mono<Card> updateById(final String id, final Card card) {

        return cardDaoInte.save(card)
                .doFirst(() -> log.info("Begin updateById Card"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Card"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return cardDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Card"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Card"));
    }

}