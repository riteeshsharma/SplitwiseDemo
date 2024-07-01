package dev.riteesh.SpltiwiseDemo.strategies.settleupstrategy;

import dev.riteesh.SpltiwiseDemo.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bruteForceSettleUpStrategy")
public class BruteForceSettleUpStrategy implements SettleUpStrategy {

    @Override
    public List<Transaction> settle(List<Expense> expenses) {
        return null;
    }
}
