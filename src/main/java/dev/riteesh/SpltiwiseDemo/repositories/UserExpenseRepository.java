package dev.riteesh.SpltiwiseDemo.repositories;

import dev.riteesh.SpltiwiseDemo.models.Expense;
import dev.riteesh.SpltiwiseDemo.models.User;
import dev.riteesh.SpltiwiseDemo.models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {

    List<UserExpense> findAllByUser(User user);

    List<UserExpense> findAllByExpenseIn(List<Expense> expenses);
}
