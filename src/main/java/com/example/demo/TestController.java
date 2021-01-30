package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    String[] books = new String[]{ "Book 1", "Book2", "Book3", "Book4"};
    
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity<String> health() {
        return ResponseEntity.ok().body("health endpoint");
    }

    @GetMapping(path = "/api/books")
    public ResponseEntity<String[]> getAllBooks() {
        return ResponseEntity.ok().body(books);
    }
}
