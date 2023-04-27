package regnos.chapter11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public void withdraw(BigDecimal withdrawAmount) throws OleBalanceException {
        if(withdrawAmount.compareTo(balance) > BigInteger.ZERO.intValue()) throw new OleBalanceException("You be thief");
        balance = balance.subtract(withdrawAmount);
    }
    public void deposit(BigDecimal depositAmount){
        balance = balance.add(depositAmount);
    }
}
