package com.jpassgo.bankapi.bankapi.services;

import com.jpassgo.bankapi.bankapi.models.Account;
import com.jpassgo.bankapi.bankapi.models.CheckingAccount;
import com.jpassgo.bankapi.bankapi.models.SavingsAccount;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

  public UsersService usersService;

  public String createSavingsAccount(String userId, SavingsAccount savingsAccount) {
    return createAccount(userId, savingsAccount);
  }

  public String createCheckingAccount(String userId, CheckingAccount checkingAccount) {
    return createAccount(userId, checkingAccount);
  }

  public String createAccount(String userId, Account account) {
    var user = usersService.getUser(userId);
    var accounts = user.getAccounts();
    accounts.add(account);
    user.setAccounts(accounts);
    return usersService.updateUser(user).getId();
  }
}
