package com.toomuch2learn.microservices.servicea.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toomuch2learn.microservices.servicea.model.Greeting;

@FeignClient(value = "servicec", url = "http://localhost:8083")
public interface ServiceCClient {

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    Greeting getGreetingMessage();
}