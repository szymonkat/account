package com.kodilla.account.domain;

import com.kodilla.account.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class GetAccountsResponse {

    private List<AccountDto> accounts;

}
