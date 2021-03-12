package com.kodilla.account.service.interfaces;

import com.kodilla.account.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccountsByCustomerId(final Long customerId);
}
