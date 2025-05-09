package com.criativy.salao_api.controller;

import com.criativy.salao_api.dto.UserFeedbackDto;
import com.criativy.salao_api.service.UserFeedBackService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user-feedback", produces = "application/json")
public class UserFeedbackController {

    @Autowired
    private UserFeedBackService service;

    @PostMapping
    public ResponseEntity<UserFeedbackDto> save(@Valid @RequestBody UserFeedbackDto dto) {
        UserFeedbackDto saved = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public Page<UserFeedbackDto> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        System.out.println("chegou aqui");
        return service.findAll(page, size);
    }
}
