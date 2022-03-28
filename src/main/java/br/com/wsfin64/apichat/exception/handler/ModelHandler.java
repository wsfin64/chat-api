package br.com.wsfin64.apichat.exception.handler;

public class ModelHandler {

    private String msg;

    ModelHandler(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}
