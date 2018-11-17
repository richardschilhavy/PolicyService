package com.example.service.policy.PolicyService;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

@Entity
@Table(name="POLICY")
@Getter
@Setter
@ToString
public class Policy {

    // attributes
    @Id
    private Long policyNo;
    private String firstName;
    private String lastName;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal deductible;
    private final Currency currencyType = Currency.getInstance(Locale.US);

    public Policy () {}

    // explicit constructor
    public Policy (Long policyNo, String firstName, String lastName, LocalDate startDate, LocalDate endDate, BigDecimal deductible)
    {
        this.policyNo = policyNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deductible = deductible;
    }

    // explicit constructor with Strings for complex datatypes
    public Policy (Long policyNo, String firstName, String lastName, String startDate, String endDate, String deductible) {
        this(policyNo, firstName, lastName, LocalDate.parse(startDate), LocalDate.parse(endDate), new BigDecimal(deductible));
    }
}
