package com.app.account.service.implementations;

import com.app.account.domain.Customer;
import com.app.account.exceptions.NotFoundException;
import com.app.account.repository.CustomerRepository;
import com.app.account.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    //private final CustomerService customerService;

    @Override
    public Customer getCustomerById(Long customerId) {
        // Test response
        /*Account account = new Account(1421L, "72249000059957936727967706", Currency.PLN, 6525.11F);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        Customer customer = new Customer(123456L, accountList);

        return customerId == 123456 ? customer : null;*/

        return customerRepository.findById(customerId).orElseThrow(
                () -> new NotFoundException("Customer with id: " + customerId + " does not exist"));
    }
}
