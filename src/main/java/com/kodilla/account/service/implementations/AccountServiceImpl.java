package com.kodilla.account.service.implementations;

import com.kodilla.account.domain.Account;
import com.kodilla.account.repository.AccountRepository;
import com.kodilla.account.service.interfaces.AccountService;
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
