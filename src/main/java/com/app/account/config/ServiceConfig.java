package com.app.account.config;

import com.app.account.repository.AccountRepository;
import com.app.account.service.implementations.AccountServiceImpl;
import com.app.account.service.interfaces.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected AccountService accountService(AccountRepository accountRepository) {
        return new AccountServiceImpl(accountRepository);
    }

}
