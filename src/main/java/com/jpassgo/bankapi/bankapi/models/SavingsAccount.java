package com.jpassgo.bankapi.bankapi.models;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class SavingsAccount extends Account {
  private BigDecimal interestAccruedAmmount;
  private BigDecimal interestRate;
}
