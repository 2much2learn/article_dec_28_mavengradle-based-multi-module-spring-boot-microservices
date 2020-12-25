package com.toomuch2learn.microservices.servicea.client;

import com.toomuch2learn.microservices.servicea.model.Greeting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "servicec", url = "${servicec.url}")
public interface ServiceCClient {

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    Greeting getGreetingMessage();
}