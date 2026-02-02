package com.example.finance1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.finance1.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
