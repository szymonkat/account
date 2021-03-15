package com.kodilla.accounts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferAccountValueCheck {

    private String nrb;
    private BigDecimal availableFunds;

}
