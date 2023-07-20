package com.vinsguru.productservice.exceptions;

import com.vinsguru.productservice.dto.ServiceUnavailableResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.vinsguru.productservice.exceptions.ServiceUnavailbleException;

@ControllerAdvice
public class ServiceUnavailableExceptionHandler {
    @ExceptionHandler(ServiceUnavailbleException.class)
    public ResponseEntity<ServiceUnavailableResponse> handleException(ServiceUnavailbleException ex){
        ServiceUnavailableResponse response = new ServiceUnavailableResponse();
        response.setErrorCode(ex.getErrorCode());
        response.setInput(ex.getInput());
        response.setMessage(ex.getMessage());
        System.out.println(response.toString());
        return ResponseEntity.badRequest().body(response);
    }
}
