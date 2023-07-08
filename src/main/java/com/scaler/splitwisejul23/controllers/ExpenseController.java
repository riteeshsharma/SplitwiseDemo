package com.scaler.splitwisejul23.controllers;

import com.scaler.splitwisejul23.dtos.SettleUpGroupRequestDto;
import com.scaler.splitwisejul23.dtos.SettleUpGroupResponseDto;
import com.scaler.splitwisejul23.dtos.SettleUpUserRequestDto;
import com.scaler.splitwisejul23.dtos.SettleUpUserResponseDto;
import com.scaler.splitwisejul23.services.ExpenseService;
import com.scaler.splitwisejul23.strategies.settleupstrategy.Transaction;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ExpenseController {
    private ExpenseService expenseService;


    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto request) {
        List<Transaction> transactions = expenseService
                .settleUpUser(request.getUserId());


        SettleUpUserResponseDto response = new SettleUpUserResponseDto();
        response.setStatus("SUCCESS");
        response.setTransactions(transactions);

        return response;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto request) {
        return null;
    }
}
