package com.example.service.policy.PolicyService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long>
{
    List<Policy> findByLastName(String lastName);
    List<Policy> findByEndDateAfter(LocalDate endDate);
    List<Policy> findByEndDateBetween(LocalDate firstDate, LocalDate lastDate);
}