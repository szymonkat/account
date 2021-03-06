package com.app.account.service.interfaces;

import com.app.account.domain.Customer;

public interface CustomerService {
    Customer saveCustomer(final Customer customer);
    Customer getCustomerById(final Long customerId);
}
