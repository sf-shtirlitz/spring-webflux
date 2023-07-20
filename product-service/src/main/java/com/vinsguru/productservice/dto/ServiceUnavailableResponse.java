package com.vinsguru.productservice.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServiceUnavailableResponse {
    private int errorCode;
    private int input;
    private String message;
}
