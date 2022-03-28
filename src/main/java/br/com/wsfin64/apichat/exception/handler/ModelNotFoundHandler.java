package br.com.wsfin64.apichat.exception.handler;

import br.com.wsfin64.apichat.exception.ModelNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ModelNotFoundHandler {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ModelNotFoundException.class)
    public ModelHandler handle(ModelNotFoundException exception){
        ModelHandler modelHandler = new ModelHandler(exception.getMessage());
        return modelHandler;
    }
}
