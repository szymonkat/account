package com.kodilla.accounts.service.interfaces;

import com.kodilla.accounts.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccountsByCustomerId(final Long customerId);
}
