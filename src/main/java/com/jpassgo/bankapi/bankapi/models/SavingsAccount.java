package com.jpassgo.bankapi.bankapi.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SavingsAccount extends Account {
    private BigDecimal interestAccruedAmmount;
}
