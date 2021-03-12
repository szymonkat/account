package com.kodilla.account.config;

import com.kodilla.account.repository.AccountRepository;
import com.kodilla.account.service.implementations.AccountServiceImpl;
import com.kodilla.account.service.interfaces.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected AccountService accountService(AccountRepository accountRepository) {
        return new AccountServiceImpl(accountRepository);
    }

}
