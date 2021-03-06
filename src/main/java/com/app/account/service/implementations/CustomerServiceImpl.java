package com.app.account.service.implementations;

import com.app.account.domain.Account;
import com.app.account.domain.Currency;
import com.app.account.domain.Customer;
import com.app.account.exceptions.NotFoundException;
import com.app.account.repository.CustomerRepository;
import com.app.account.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Long customerId) throws NotFoundException {
        // Test response
        Account account = new Account(1421L, "72249000059957936727967706", Currency.PLN, BigDecimal.valueOf(652543243.213));
        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        Customer customer = new Customer(123456L, accountList);

        return customerId == 123456 ? new Customer(123456L, new ArrayList<>(accountList)) : null;
/*
        return customerRepository.findById(customerId).orElseThrow(
                () -> new NotFoundException("Customer with id: " + customerId + " does not exist"));*/
    }
}
