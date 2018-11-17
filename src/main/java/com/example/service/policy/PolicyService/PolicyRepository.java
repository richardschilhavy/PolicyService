package com.example.service.policy.PolicyService;

/* interface code

public interface PolicyRepository extends JpaRepository<Policy, Long>
{
    void addPolicy(Policy policy);
}*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class PolicyRepository
{
    @Autowired
    JdbcTemplate jdbcTemplate;
}