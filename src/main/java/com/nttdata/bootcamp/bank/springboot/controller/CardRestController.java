package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/business-microservice0502-card/card")
public class CardRestController {

    private static final Logger log = LoggerFactory.getLogger(CardServiceInte.class);

    @Autowired
    private CardServiceInte cardServiceInte;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Mono<Card> create(@RequestBody final Card location) {
        log.debug("Begin RestController create Card");
        return cardServiceInte.create(location);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Flux<Card> readAll() {
        log.debug("Begin RestController readAll Card");
        return cardServiceInte.readAll();
    }

    @RequestMapping(value = "/readByCodeCard/{codeCard}", method = RequestMethod.GET)
    public Mono<Card> readByCodeCard(@PathVariable String codeCard) {
        log.debug("Begin RestController readByCodeLocation Card");
        return cardServiceInte.readByCodeCard(codeCard);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Mono<Card> updateById(@RequestBody final Card card, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Card");
        return cardServiceInte.updateById(id, card);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Card");
        return cardServiceInte.deleteById(id);
    }

}