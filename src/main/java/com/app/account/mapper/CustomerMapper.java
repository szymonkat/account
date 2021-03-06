package com.app.account.mapper;

import com.app.account.domain.Customer;
import com.app.account.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    public Customer mapToCustomer(CustomerDto customerDto) {
        return new Customer(customerDto.getId(),
                customerDto.getFirstName(),
                customerDto.getFirstName());
    }

    public CustomerDto mapToCustomerDto(Customer customer) {
        return new CustomerDto(customer.getId(),
                customer.getFirstName(),
                customer.getLastName());
    }
}
