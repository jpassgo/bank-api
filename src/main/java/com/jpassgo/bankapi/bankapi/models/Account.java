package com.jpassgo.bankapi.bankapi.models;

import com.jpassgo.bankapi.bankapi.enums.AccountType;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;

@Data
public abstract class Account {

  @Id private Integer number;
  private BigDecimal balance;

  @Value("#{ LocalDate.now() }")
  private LocalDate openDate;

  private LocalDate closeDate;
  private boolean isFrozen;

  public abstract AccountType getAccountType();
}
