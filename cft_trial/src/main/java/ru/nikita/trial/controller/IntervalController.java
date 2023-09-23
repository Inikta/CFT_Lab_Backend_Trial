package ru.nikita.trial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Getter;
import ru.nikita.trial.utils.IntervalType;

@Controller
@RequestMapping("/api/v1/intervals/")
public class IntervalController {

    @GetMapping("min?kind={type}")
    public ResponseEntity<?> minimalNumberInterval(@PathVariable("type") IntervalType type) {
        return new ResponseEntity.ok().build();
    }

    @PostMapping("merge?kind={type}")
    public ResponseEntity<?> postInterval(@PathVariable("type") IntervalType type) {
        return new ResponseEntity.ok().build();
    }
}
