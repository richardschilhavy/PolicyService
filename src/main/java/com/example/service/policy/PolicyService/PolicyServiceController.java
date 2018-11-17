package com.example.service.policy.PolicyService;

import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
public class PolicyServiceController {

    // xTODO inject and autowire repository
    //@Autowired
    //private PolicyRepository repository;

    // xTODO Create One Policy (POST)

    @PostMapping("/policy")
    public String addPolicy(@RequestBody Policy policy)
    {
        //repository.addPolicy(policy);
        return "Policy " + policy.getPolicyNo() + " saved.";
    }

    // TODO Create Many Policies (POST)

    // TODO Read One Policy (GET)

    @GetMapping("/policy")
    public Policy getNewPolicy()
    {
        // initalized policy
        Policy p = new Policy (
                1233456L,
                "John",
                "Smith",
                LocalDate.of(2018,11,16),
                LocalDate.of(2019,11,16),
                BigDecimal.valueOf(125.5)
                );
        return p;

        // new Policy
    }

    // TODO Read Many Policy (GET)

/*    @GetMapping("/policies")
    public List<Policy> getAllPolicies()
    {
            return this.repository.findAll();
    }*/

    // TODO Update One Policy (PUT)

    // TODO Delete One Policy (DELETE)
}
