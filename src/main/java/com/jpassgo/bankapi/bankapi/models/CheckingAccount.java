package com.jpassgo.bankapi.bankapi.models;

import java.math.BigDecimal;
import java.time.Duration;
import lombok.Data;

@Data
public class CheckingAccount extends Account {
  private BigDecimal withdrawalAmmountAllowed;
  private Duration withdrawalResetPeriod;
}
