package com.app.account.service.interfaces;

import com.app.account.domain.Customer;

public interface CustomerService {
    Customer getCustomerById(final Long customerId);
}
