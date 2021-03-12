package com.kodilla.accounts.dto;

import com.kodilla.accounts.domain.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {

    private Long id;
    private String nrb;
    private Currency currency;
    private BigDecimal availableFunds;

}
