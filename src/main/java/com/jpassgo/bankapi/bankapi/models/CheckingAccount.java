package com.jpassgo.bankapi.bankapi.models;

import java.math.BigDecimal;
import java.time.Duration;

import com.jpassgo.bankapi.bankapi.enums.AccountType;
import lombok.Data;

import static com.jpassgo.bankapi.bankapi.enums.AccountType.CHECKING_ACCOUNT;

@Data
public class CheckingAccount extends Account {
  private static final AccountType ACCOUNT_TYPE = CHECKING_ACCOUNT;
  private BigDecimal withdrawalAmmountAllowed;
  private Duration withdrawalResetPeriod;

  public AccountType getAccountType() {
    return ACCOUNT_TYPE;
  }
}
