package br.com.wsfin64.apichat.controller;

import br.com.wsfin64.apichat.entities.Model;
import br.com.wsfin64.apichat.exception.ModelNotFoundException;
import br.com.wsfin64.apichat.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/model")
public class ModelControler {

    @Autowired
    private ModelService modelService;

    @GetMapping("/{broadcaster_name}")
    public ResponseEntity<Model> getModel(@PathVariable String broadcaster_name) throws ModelNotFoundException {
        return ResponseEntity.ok(modelService.getModel(broadcaster_name));
    }
}
