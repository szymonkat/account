package com.app.account.controller;

import com.app.account.dto.CustomerDto;
import com.app.account.mapper.CustomerMapper;
import com.app.account.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerMapper customerMapper;
    private final CustomerService customerService;

    @GetMapping
    public CustomerDto getAccountsByCustomerId(@RequestParam Long customerId)  {
        return customerMapper.mapToCustomerDto(customerService.getCustomerById(customerId));
    }
}