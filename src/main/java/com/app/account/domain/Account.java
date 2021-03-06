package com.app.account.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

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
        return customer != null ? customer.equals(account.customer) : account.customer == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nrb.hashCode();
        result = 31 * result + currency.hashCode();
        result = 31 * result + availableFunds.hashCode();
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
    }
}
