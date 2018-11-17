package com.example.service.policy.PolicyService;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Policy {

    // attributes
    @Id
    private Long policyNo; // mapped to BigInt
    private String firstName;
    private String lastName;
    private LocalDate startDate; // mapped to Date
    private LocalDate endDate; // mapped to Date
    private BigDecimal deductible; // mapped to Decimal(20,2)
    // private final Currency currencyType = Currency.getInstance(Locale.US);

/*    public Policy () {}

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
    }*/
}
