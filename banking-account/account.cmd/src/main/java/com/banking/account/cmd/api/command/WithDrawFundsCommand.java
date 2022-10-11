package com.banking.account.cmd.api.command;

import com.banking.cqrs.core.messeges.Message;
import lombok.Data;

@Data
public class WithDrawFundsCommand extends Message {
    private double amount;
}
