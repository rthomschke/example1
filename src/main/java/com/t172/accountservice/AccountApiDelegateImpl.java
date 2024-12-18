package com.t172.accountservice;

import org.openapitools.api.AccountApiDelegate;
import org.openapitools.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class AccountApiDelegateImpl implements AccountApiDelegate {

    @Override
    public ResponseEntity<Account> getAccount() {
        Account account = new Account();
        account.setBalance(BigDecimal.valueOf(3000));

        // ... omit other initialization

        return ResponseEntity.ok(account);
    }
}