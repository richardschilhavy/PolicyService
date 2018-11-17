package com.example.service.policy.PolicyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
public class PolicyServiceController {

    // TODO Create One/Many Policy (POST)

    // TODO Read One/Many Policy (GET)

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/policy")
    public Policy getPolicy() {
        Policy p = new Policy (
                1233456L,
                "John",
                "Smith",
                LocalDate.of(2018,11,16),
                LocalDate.of(2019,11,16),
                BigDecimal.valueOf(125.5)
                );
        return p;
    }

    // TODO Update One Policy (PUT)

    // TODO Delete One Policy (DELETE)
}
