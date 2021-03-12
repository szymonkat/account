package com.kodilla.accounts.service.implementations;

import com.kodilla.accounts.domain.Account;
import com.kodilla.accounts.repository.AccountRepository;
import com.kodilla.accounts.service.interfaces.AccountService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAccountsByCustomerId(Long customerId) {
        return accountRepository.findByCustomerId(customerId);
    }
}
