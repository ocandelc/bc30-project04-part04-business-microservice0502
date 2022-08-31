package com.nttdata.bootcamp.bank.springboot.location.springflux.controller;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;

@SpringBootTest
public class CardRestControllerTest {

    @MockBean
    private CardServiceInte cardServiceInte;

    @Test
    void readAllTest() {

        Flux<Card> fluxCard = cardServiceInte.readAll();

        Mockito.verify(cardServiceInte).readAll();

     }

}
