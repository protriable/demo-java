package com.protry.service.impl;

import com.protry.dao.AccountDao;
import com.protry.domain.entity.Account;
import com.protry.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author bshao
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account add(Account account) {
        return accountDao.save(account);
    }

    @Override
    public Account update(Account account) {
        return accountDao.saveAndFlush(account);
    }

    @Override
    public void delete(int id) {
        accountDao.deleteById(id);
    }

    @Override
    public Optional<Account> findAccountById(int id) {
        return accountDao.findById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAll();
    }
}
