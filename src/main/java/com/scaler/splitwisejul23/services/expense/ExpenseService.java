package com.scaler.splitwisejul23.services.expense;

import com.scaler.splitwisejul23.models.Expense;
import com.scaler.splitwisejul23.models.User;
import com.scaler.splitwisejul23.models.UserExpense;
import com.scaler.splitwisejul23.repositories.UserExpenseRepository;
import com.scaler.splitwisejul23.repositories.UserRepository;
import com.scaler.splitwisejul23.strategies.settleupstrategy.Transaction;
import com.scaler.splitwisejul23.strategies.settleupstrategy.TwoSetsSettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    private UserRepository userRepository;
    private UserExpenseRepository userExpenseRepository;
    private TwoSetsSettleUpStrategy twoSetsSettleUpStrategy;

    @Autowired
    public ExpenseService(UserRepository userRepository, UserExpenseRepository userExpenseRepository, TwoSetsSettleUpStrategy twoSetsSettleUpStrategy) {
        this.userRepository = userRepository;
        this.userExpenseRepository = userExpenseRepository;
        this.twoSetsSettleUpStrategy = twoSetsSettleUpStrategy;
    }

    public List<Transaction> settleUpUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isEmpty()) {
            // throw Exception
            return null;
        }

        List<UserExpense> userExpenses = userExpenseRepository.findAllByUser(userOptional.get());

        List<Expense> expensesInvolvingUser = new ArrayList<>();
        for (UserExpense userExpense: userExpenses) {
            expensesInvolvingUser.add(userExpense.getExpense());
        }

        List<Transaction> transactions = twoSetsSettleUpStrategy.settle(expensesInvolvingUser);

        return null;
    }
}
