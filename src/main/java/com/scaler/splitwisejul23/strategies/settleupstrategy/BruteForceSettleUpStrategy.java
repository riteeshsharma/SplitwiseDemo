package com.scaler.splitwisejul23.strategies.settleupstrategy;

import com.scaler.splitwisejul23.models.Expense;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component("bruteForceSettleUpStrategy")
public class BruteForceSettleUpStrategy implements SettleUpStrategy {

    @Override
    public List<Transaction> settle(List<Expense> expenses) {
        return null;
    }
}
