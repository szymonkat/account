package com.app.account.config;

import com.app.account.repository.CustomerRepository;
import com.app.account.service.implementations.CustomerServiceImpl;
import com.app.account.service.interfaces.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerServiceImpl(customerRepository);
    }

}
