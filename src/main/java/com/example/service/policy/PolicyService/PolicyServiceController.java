package com.example.service.policy.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PolicyServiceController {

    @Autowired
    private PolicyRepository policyRepository;

    //=== CREATE ===//

    @PostMapping("/policies")
    public String savePolicy(@RequestBody Policy policy) {
        if (policyRepository.findById(policy.getPolicyNo()).isPresent()) {
            return "Conflicting policyNo " + policy.getPolicyNo() + " found.";
        }
        else {
            policyRepository.save(policy);
            return "Policy saved: " + policy;
        }
    }

    // TODO Create Many Policies (POST)

    //=== READ ===//

    // xTODO Read One Policy (GET)

    @GetMapping("/policies/{id}")
    @ResponseBody
    public Optional<Policy> getPolicy(@PathVariable("id") long id)  {
        return policyRepository.findById(id);
    }

    // TODO Read One Policy by LastName

    @GetMapping("/policies/lastname/{lastName}")
    @ResponseBody
    public List<Policy> getPolicy(@PathVariable("lastName") String lastName) {
        return policyRepository.findByLastName(lastName);
    }

    // xTODO Read Many Policy (GET)

    @GetMapping("/policies")
    public List<Policy> getAllPolicies()
    {
        return this.policyRepository.findAll();
    }

    //=== UPDATE ===//

    // xTODO Update One Policy (PUT)

    @PutMapping("/policies/{id}")
    @ResponseBody
    public Policy updatePolicy(@RequestBody Policy policy, @PathVariable("id") long id)
    {
        // add exception to catch when policy isn't found?
        Policy currentPolicy = policyRepository.findById(id).get();

        // provide create option if no matching policy found
        if (currentPolicy==null)
        {
            policyRepository.save(policy);
        }
        // remove and update
        else
        {
            policyRepository.delete(currentPolicy);
            policyRepository.save(policy);
        }

        return policy;
    }

    //=== DELETE ===//

    // TODO Delete One Policy (DELETE)
}
