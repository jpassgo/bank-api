package com.jpassgo.bankapi.bankapi.controllers;

import com.jpassgo.bankapi.bankapi.models.Account;
import com.jpassgo.bankapi.bankapi.services.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AccountsController {

  private final AccountsService accountsService;

  @PostMapping
  public Integer createAccount(Account account) {
    return accountsService.createCheckingAccount();
  }

  @GetMapping
  public Account getAccount(int number) {
    return null;
  }

  @PutMapping
  public Account updateAccount(Account account) {
    return null;
  }

  @DeleteMapping
  public int deleteAccount(int number) {
    return 0;
  }
}
