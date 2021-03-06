package com.app.account.controller;

import com.app.account.dto.CustomerDto;
import com.app.account.mapper.CustomerMapper;
import com.app.account.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/v1/accounts")
@RequiredArgsConstructor
public class CustomerController {

    @Value("${application.allow-get-accounts}")
    private boolean allowGetAccounts;

    private final CustomerMapper customerMapper;
    private final CustomerService customerService;

    @GetMapping
    public CustomerDto getAccountsByCustomerId(@RequestParam Long customerId)  {
        if(!allowGetAccounts) {
            log.info("Getting accounts is disabled");
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Getting accounts is disabled");
        }
        return customerMapper.mapToCustomerDto(customerService.getCustomerById(customerId));
    }
}