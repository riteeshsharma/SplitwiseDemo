package com.scaler.splitwisejul23.repositories;

import com.scaler.splitwisejul23.models.Expense;
import com.scaler.splitwisejul23.models.User;
import com.scaler.splitwisejul23.models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {

    List<UserExpense> findAllByUser(User user);

    List<UserExpense> findAllByExpenseIn(List<Expense> expenses);
}
