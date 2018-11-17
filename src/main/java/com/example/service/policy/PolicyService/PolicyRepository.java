package com.example.service.policy.PolicyService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface PolicyRepository extends CrudRepository<Policy, Long>
{
    List<Policy> findByLastName(String name );
}