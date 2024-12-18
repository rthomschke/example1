package com.t172.accountservice;


import java.util.Optional;

import org.openapitools.api.AccountApi;
import org.openapitools.api.AccountApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/ma"})
public class MaController implements AccountApi {
    private final AccountApiDelegate delegate;

    public MaController(@Autowired(required = false) AccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AccountApiDelegate() {
        });
    }

    @Override
    public AccountApiDelegate getDelegate() {
        return this.delegate;
    }
}

