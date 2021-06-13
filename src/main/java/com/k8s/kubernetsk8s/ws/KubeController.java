package com.k8s.kubernetsk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome - suresh-k8s";
    }
}
