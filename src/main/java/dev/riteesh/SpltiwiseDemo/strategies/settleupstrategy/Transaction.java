package dev.riteesh.SpltiwiseDemo.strategies.settleupstrategy;

import dev.riteesh.SpltiwiseDemo.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private User from;
    private User to;
    private Integer amount;
}
