package com.visitors.service;

import com.visitors.model.Visitor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorService {

    public Flux<Visitor> getAll() {
        return Flux.fromIterable(mockUsers())
                .delayElements(Duration.ofMillis(1000));
    }

    private List<Visitor> mockUsers() {
        Faker faker = new Faker();
        List<Visitor> visitors = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            visitors.add(Visitor.builder()
                    .id(i)
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .build()
            );
        }
        return visitors;
    }
}
