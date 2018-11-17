package com.example.service.policy.PolicyService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepositoryInterface extends JpaRepository<Policy, Long>
{
    void addPolicy(Policy policy);
}