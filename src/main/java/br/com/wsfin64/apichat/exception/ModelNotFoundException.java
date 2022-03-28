package br.com.wsfin64.apichat.exception;

public class ModelNotFoundException extends RuntimeException{

    private String msg;

    public ModelNotFoundException(String msg){
        super(msg);
    }
}
