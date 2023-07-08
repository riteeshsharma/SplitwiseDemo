package com.scaler.splitwisejul23.repositories;

import com.scaler.splitwisejul23.models.Expense;
import com.scaler.splitwisejul23.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findAllByGroups(Group group);
}
