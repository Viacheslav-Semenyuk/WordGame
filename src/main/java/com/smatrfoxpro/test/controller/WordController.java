package com.smatrfoxpro.test.controller;

import com.smatrfoxpro.test.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/begin")
    public ResponseEntity<String> begin() {
        return new ResponseEntity<>(wordService.begin(), HttpStatus.OK);
    }

    @GetMapping("/next")
    public ResponseEntity<String> getNextWord(@RequestParam String word) {
        return new ResponseEntity<>(wordService.getNextWord(word), HttpStatus.OK);
    }

    @PostMapping("/end")
    public ResponseEntity<String> end() {
        return new ResponseEntity<>(wordService.end(), HttpStatus.OK);
    }

}
