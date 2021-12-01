package com.jpassgo.bankapi.bankapi.controllers;

import com.jpassgo.bankapi.bankapi.enums.AccountType;
import com.jpassgo.bankapi.bankapi.models.Account;
import com.jpassgo.bankapi.bankapi.models.CheckingAccount;
import com.jpassgo.bankapi.bankapi.models.SavingsAccount;
import com.jpassgo.bankapi.bankapi.services.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.jpassgo.bankapi.bankapi.enums.AccountType.*;

@RestController("/accounts")
@RequiredArgsConstructor
public class AccountsController {

  private final AccountsService accountsService;

  @PostMapping
  public String createAccount(String userId, Account account) {
    if(account.getAccountType().equals(CHECKING_ACCOUNT)) {
      return accountsService.createCheckingAccount(userId, (CheckingAccount) account);
    } else {
      return accountsService.createSavingsAccount(userId,(SavingsAccount) account);
    }
  }

  @GetMapping
  public ResponseEntity<Account> getAccount(String number, AccountType accountType) {
    var maybeAccount = accountsService.getAccount(number, accountType);
    if(maybeAccount.isPresent()) {
      return new ResponseEntity(maybeAccount.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
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
