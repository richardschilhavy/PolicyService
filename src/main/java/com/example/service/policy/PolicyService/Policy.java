package com.example.service.policy.PolicyService;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.ConstrainedTo;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

@Entity
@Table(name = "policy")
@Getter
@Setter
@NoArgsConstructor
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
    private final Currency usd = Currency.getInstance(Locale.US);

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
    public Policy (Long policyNo, String firstName, String lastName, String startDate, String endDate, String deductible)
    {
        this(policyNo, firstName, lastName, LocalDate.parse(startDate), LocalDate.parse(endDate), new BigDecimal(deductible));
    }

    @Override public String toString() {
        return "I'm a Policy";
    }
}
