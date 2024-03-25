package com.xplor.websocket.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleError() {
        String errorMessage = "404 Not Page Found - chakkaga paduko velli 😊";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);    }


//    @Override
    public String getErrorPath() {
        return "/error";
    }

}
