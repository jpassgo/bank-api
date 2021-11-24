package com.jpassgo.bankapi.bankapi.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public abstract class Account {
    private int number;
    private BigDecimal balance;

    @Value("#{ LocalDate.now() }")
    private LocalDate openDate;
    private LocalDate closeDate;
    private boolean isFrozen;
}
