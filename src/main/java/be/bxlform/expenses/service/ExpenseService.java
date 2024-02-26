package be.bxlform.expenses.service;

import java.util.List;

import be.bxlform.expenses.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);
}
