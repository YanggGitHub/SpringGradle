package com.yang.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {
    public ErrorResponse(String message, String deails) {
        this.message = message;
        this.deails = deails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDeails() {
        return deails;
    }

    public void setDeails(String deails) {
        this.deails = deails;
    }

    private String message;
    private String deails;
}
