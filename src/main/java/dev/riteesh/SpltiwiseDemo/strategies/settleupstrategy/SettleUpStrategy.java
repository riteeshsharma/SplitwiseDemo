package dev.riteesh.SpltiwiseDemo.strategies.settleupstrategy;

import dev.riteesh.SpltiwiseDemo.models.Expense;

import java.util.List;

public interface SettleUpStrategy {

    List<Transaction> settle(List<Expense> expenses);
}
