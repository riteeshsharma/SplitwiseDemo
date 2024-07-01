package dev.riteesh.SpltiwiseDemo.controllers;

import dev.riteesh.SpltiwiseDemo.dtos.SettleUpGroupRequestDto;
import dev.riteesh.SpltiwiseDemo.dtos.SettleUpGroupResponseDto;
import dev.riteesh.SpltiwiseDemo.dtos.SettleUpUserRequestDto;
import dev.riteesh.SpltiwiseDemo.dtos.SettleUpUserResponseDto;
import dev.riteesh.SpltiwiseDemo.services.ExpenseService;
import dev.riteesh.SpltiwiseDemo.strategies.settleupstrategy.Transaction;
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
