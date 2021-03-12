package com.kodilla.accounts.config;

import com.kodilla.accounts.repository.AccountRepository;
import com.kodilla.accounts.service.implementations.AccountServiceImpl;
import com.kodilla.accounts.service.interfaces.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected AccountService accountService(AccountRepository accountRepository) {
        return new AccountServiceImpl(accountRepository);
    }

}
