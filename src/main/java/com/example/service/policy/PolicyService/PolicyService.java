package com.example.service.policy.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface PolicyService
{
    public void save(Policy policy);
}

@Service
class PolicyServiceImpl implements PolicyService
{
    // xTODO inject and autowire repository
    @Autowired
    private PolicyRepository policyRepository;

    public void save(Policy policy)
    {
        policyRepository.save(policy);
    }
}
