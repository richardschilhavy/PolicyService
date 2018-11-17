package com.example.service.policy.PolicyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyServiceController {

    @GetMapping("/policy")
    Policy newPolicy() {
        return new Policy();
    }
}
