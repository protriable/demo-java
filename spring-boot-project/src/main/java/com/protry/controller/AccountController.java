package com.protry.controller;

import com.protry.dao.AccountDao;
import com.protry.domain.entity.Account;
import com.protry.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author bshao
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("list")
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @GetMapping("{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        Optional<Account> accountOptional = accountService.findAccountById(id);
        if (accountOptional.isPresent()) {
            return accountOptional.get();
        } else {
            return null;
        }
    }

    @PutMapping("{id}")
    public String updateAccount(@PathVariable("id") int id,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        Account newAccount = accountService.update(account);
        return newAccount.toString();
    }

    @PostMapping("")
    public String addAccount(@RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account newAccount = accountService.add(account);
        return newAccount.toString();
    }
}
