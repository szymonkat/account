package com.kodilla.accounts.mapper;

import com.kodilla.accounts.domain.Account;
import com.kodilla.accounts.dto.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AccountMapper {

    public Account mapToAccount(AccountDto accountDto) {
        return new Account(
                accountDto.getId(),
                accountDto.getNrb(),
                accountDto.getCurrency(),
                accountDto.getAvailableFunds());
    }

    public AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getNrb(),
                account.getCurrency(),
                account.getAvailableFunds());
    }


    public List<AccountDto> mapToAccountDtoList(List<Account> accountList) {
        return accountList.stream()
                .map(this::mapToAccountDto)
                .collect(Collectors.toList());
    }

    public List<Account> mapToAccountList(List<AccountDto> accountDtoList) {
        return accountDtoList.stream()
                .map(this::mapToAccount)
                .collect(Collectors.toList());
    }



}
