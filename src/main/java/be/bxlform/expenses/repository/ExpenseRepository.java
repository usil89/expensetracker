package be.bxlform.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.bxlform.expenses.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
