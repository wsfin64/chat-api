package br.com.wsfin64.apichat.feign;

import br.com.wsfin64.apichat.entities.Model;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://chaturbate.com/api/chatvideocontext/", name = "chaturbate-api")
public interface ModelClient {

    @GetMapping(value = "/{broadcaster_name}")
    ResponseEntity<Model> getModel(@PathVariable String broadcaster_name);
}
