package com.example.finance1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finance1.model.Transaction;
import com.example.finance1.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;

    public List<Transaction> getAll() {
        return repo.findAll();
    }

    // ✅ Save one transaction
    public Transaction save(Transaction transaction) {
        return repo.save(transaction);
    }
}
