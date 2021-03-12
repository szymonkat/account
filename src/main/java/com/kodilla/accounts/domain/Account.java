package com.kodilla.accounts.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "ACCOUNTS")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(unique = true)
    private String nrb;

    @NotEmpty
    @Column
    private Currency currency;

    @NotEmpty
    @Column
    private BigDecimal availableFunds;

    @Column
    private Long customerId;

    public Account(Long id, String nrb, Currency currency, BigDecimal availableFunds) {
        this.id = id;
        this.nrb = nrb;
        this.currency = currency;
        this.availableFunds = availableFunds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!id.equals(account.id)) return false;
        if (!nrb.equals(account.nrb)) return false;
        if (currency != account.currency) return false;
        if (!availableFunds.equals(account.availableFunds)) return false;
        return customerId.equals(account.customerId);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nrb.hashCode();
        result = 31 * result + currency.hashCode();
        result = 31 * result + availableFunds.hashCode();
        result = 31 * result + customerId.hashCode();
        return result;
    }
}
