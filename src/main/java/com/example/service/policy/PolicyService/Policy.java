package com.example.service.policy.PolicyService;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Policy {

    @Id
    private long policyNo; // mapped to BigInt
    private String firstName;
    private String lastName;
    private LocalDate startDate; // mapped to Date
    private LocalDate endDate; // mapped to Date
    private BigDecimal deductible; // mapped to Decimal(20,2)
    private String currencyType = "USD";
        // assumed default for transactions
        // String used for easy storage and ability to be
        // passed to Currency.getInstance(currencyType)
}
