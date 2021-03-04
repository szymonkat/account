package com.app.account.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {

    @JsonIgnore
    private Long id;

    private List<AccountDto> accounts = new ArrayList<>();

    public CustomerDto(List<AccountDto> accounts) {
        this.accounts = accounts;
    }
}
