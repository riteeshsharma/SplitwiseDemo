package dev.riteesh.SpltiwiseDemo.dtos;

import dev.riteesh.SpltiwiseDemo.strategies.settleupstrategy.Transaction;

import java.util.List;

public class SettleUpGroupResponseDto {
    String message;
    String status;
    List<Transaction> transactions;
}
