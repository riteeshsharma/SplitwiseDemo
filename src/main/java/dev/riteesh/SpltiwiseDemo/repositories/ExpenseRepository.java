package dev.riteesh.SpltiwiseDemo.repositories;

import dev.riteesh.SpltiwiseDemo.models.Expense;
import dev.riteesh.SpltiwiseDemo.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findAllByGroups(Group group);
}
