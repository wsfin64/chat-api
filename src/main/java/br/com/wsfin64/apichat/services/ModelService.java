package br.com.wsfin64.apichat.services;

import br.com.wsfin64.apichat.entities.Model;
import br.com.wsfin64.apichat.exception.ModelNotFoundException;
import br.com.wsfin64.apichat.feign.ModelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    private ModelClient modelClient;

    public Model getModel(String broadcaster_name){
        try {
            Model model = modelClient.getModel(broadcaster_name).getBody();

            return model;
        }
        catch (Exception e){
            throw new ModelNotFoundException("MODELO NÃO ENCONTRADA");
        }

    }

}
