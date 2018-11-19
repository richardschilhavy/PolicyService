package com.example.service.policy.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class PolicyServiceController {

    @Autowired
    private PolicyRepository policyRepository;

    //=== CREATE ===//

    @PostMapping("/policies")
    @ResponseBody
    public String savePolicy(@RequestBody Policy policy) {
        // TODO Modify to support one or MORE policies

        if (policyRepository.findById(policy.getPolicyNo()).isPresent()) {
            return "Conflicting policyNo " + policy.getPolicyNo() + " found.";
        }
        else {
            policyRepository.save(policy);
            return "Policy saved: " + policy;
        }
    }

    //=== READ ===//

    @GetMapping("/policies/{id}")
    @ResponseBody
    public Optional<Policy> getPolicy(@PathVariable("id") long id) {
        return policyRepository.findById(id);
    }

    @GetMapping("/policies/lastname/{lastName}")
    @ResponseBody
    public List<Policy> getPolicyByLastName(@PathVariable("lastName") String lastName) {

        return policyRepository.findByLastName(lastName);
    }

    @GetMapping("/policies/date/{dateAfter}")
    @ResponseBody
    public List<Policy> getPolicyByEndDateAfter(@PathVariable("dateAfter") String dateAfter) {
        // more flexible than path for each date part, more consistent with between endpoint
        return policyRepository.findByEndDateAfter(LocalDate.parse(dateAfter));
    }

    @GetMapping("/policies/date/{firstDate}/{lastDate}")
    @ResponseBody
    public List<Policy> getPolicy(@PathVariable("firstDate") String firstDate, @PathVariable("lastDate") String lastDate) {

        // same as above
        return policyRepository.findByEndDateBetween(LocalDate.parse(firstDate), LocalDate.parse(lastDate));
    }

    @GetMapping("/policies")
    @ResponseBody
    public List<Policy> getAllPolicies() {
        return this.policyRepository.findAll();
    }

    //=== UPDATE ===//

    @PutMapping("/policies/{id}")
    @ResponseBody
    public String updatePolicy(@RequestBody Policy policy, @PathVariable("id") long id) {
        Optional<Policy> p = policyRepository.findById(id);

        if (p.isPresent()) {
            // remove and update
            policyRepository.delete(p.get());
            policyRepository.save(policy);
            return "Policy " + policy.getPolicyNo() + " updated with \n" + policy;
        } else {
            // add new policy
            policyRepository.save(policy);
            return "Policy with PolicyNo " + id + " not found.\n " + "Adding new policy.";
        }
    }

    //=== DELETE ===//

    @DeleteMapping("/policies/{id}")
    @ResponseBody
    public String deletePolicy(@PathVariable("id") long id) {
        Optional<Policy> p = policyRepository.findById(id);

        if (p.isPresent()) {
            policyRepository.delete(p.get());
            return p.get() + " deleted.";
        } else {
            return "Policy " + id + " not found";
        }
    }
}
