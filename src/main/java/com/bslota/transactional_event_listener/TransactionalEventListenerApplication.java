package com.bslota.transactional_event_listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TransactionalEventListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionalEventListenerApplication.class, args);
    }

}
