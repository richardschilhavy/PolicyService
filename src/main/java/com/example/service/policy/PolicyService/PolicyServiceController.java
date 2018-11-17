package com.example.service.policy.PolicyService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class PolicyServiceController {

    @Autowired
    private PolicyRepository policyRepository;

    // xTODO Create One Policy (POST)

    @PostMapping("/policy")
    public String addPolicy(@RequestBody Policy policy)
    {
        policyRepository.save(policy);
        return "Policy saved: \n" + policy.toString();
    }

    // TODO Create Many Policies (POST)

    // TODO Read One Policy (GET)

    @GetMapping("/policy")
    public Policy getNewPolicy()
    {
        // initalized policy
        return new Policy (
                1233456L,
                "John",
                "Smith",
                LocalDate.of(2018,11,16),
                LocalDate.of(2019,11,16),
                BigDecimal.valueOf(125.5)
        );

        // new Policy
    }

    // TODO Read Many Policy (GET)

    @GetMapping("/policies")
    public Iterable<Policy> getAllPolicies()
    {
        return this.policyRepository.findAll();
    }

    // TODO Update One Policy (PUT)

    // TODO Delete One Policy (DELETE)
}
