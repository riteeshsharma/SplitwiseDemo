package com.scaler.splitwisejul23.dtos;

import com.scaler.splitwisejul23.strategies.settleupstrategy.Transaction;

import java.util.List;

public class SettleUpGroupResponseDto {
    String message;
    String status;
    List<Transaction> transactions;
}
