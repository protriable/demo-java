package com.protry.service;

import com.protry.domain.entity.Account;

import java.util.List;
import java.util.Optional;

/**
 * @author bshao
 */
public interface IAccountService {

    Account add(Account account);

    Account update(Account account);

    void delete(int id);

    Optional<Account> findAccountById(int id);

    List<Account> findAccountList();
}
