package com.kodilla.accounts.repository;

import com.kodilla.accounts.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Override
    <S extends Account> S save(S Account);

    List<Account> findByCustomerId(long customerId);
}
