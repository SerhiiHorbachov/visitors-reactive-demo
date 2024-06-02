package com.visitors.controller;

import com.visitors.model.Visitor;
import com.visitors.service.VisitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("v1/visitors")
@RequiredArgsConstructor
public class VisitorController {

    private final VisitorService visitorService;

    @GetMapping
    Flux<Visitor> getAllVisitors() {
        return visitorService.getAll();
    }
    
}
