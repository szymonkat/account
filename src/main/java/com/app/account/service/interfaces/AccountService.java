package com.app.account.service.interfaces;

import com.app.account.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccountsByCustomerId(final Long customerId);
}
