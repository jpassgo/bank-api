package com.jpassgo.bankapi.bankapi.models;

import java.math.BigDecimal;
import com.jpassgo.bankapi.bankapi.enums.AccountType;
import lombok.Data;

import static com.jpassgo.bankapi.bankapi.enums.AccountType.SAVINGS_ACCOUNT;

@Data
public class SavingsAccount extends Account {
  private static final AccountType ACCOUNT_TYPE = SAVINGS_ACCOUNT;
  private BigDecimal interestAccruedAmmount;
  private BigDecimal interestRate;

  public AccountType getAccountType() {
    return ACCOUNT_TYPE;
  }
}
