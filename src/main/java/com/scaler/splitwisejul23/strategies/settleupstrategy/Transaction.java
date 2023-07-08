package com.scaler.splitwisejul23.strategies.settleupstrategy;

import com.scaler.splitwisejul23.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private User from;
    private User to;
    private Integer amount;
}
