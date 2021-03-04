package com.app.account.repository;

import com.app.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Override
    <S extends Account> S save(S Account);
}
