package com.app.account.service.implementations;

import com.app.account.domain.Account;
import com.app.account.repository.AccountRepository;
import com.app.account.service.interfaces.AccountService;
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
