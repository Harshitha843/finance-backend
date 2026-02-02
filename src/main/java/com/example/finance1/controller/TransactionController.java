package com.example.finance1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.finance1.model.Transaction;
import com.example.finance1.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    // ✅ Single transaction POST
    @PostMapping
    public Transaction save(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }
}
