package com.scaler.splitwisejul23.strategies.settleupstrategy;

import com.scaler.splitwisejul23.models.Expense;

import java.util.List;

public interface SettleUpStrategy {

    List<Transaction> settle(List<Expense> expenses);
}
