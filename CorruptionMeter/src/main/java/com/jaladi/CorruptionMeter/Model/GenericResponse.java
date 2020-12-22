package com.jaladi.CorruptionMeter.Model;

import org.springframework.stereotype.Component;

@Component
public class GenericResponse {

    String message;
    String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
