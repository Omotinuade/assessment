import regnos.chapter11.Account;
import regnos.chapter11.OleBalanceException;
import regnos.chapter15.Human;
import regnos.chapter15.Person;

import java.math.BigDecimal;

import static utils.AppUtils.CUSTOMER_DEFAULT_DEPOSIT_AMOUNT;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(BigDecimal.valueOf(CUSTOMER_DEFAULT_DEPOSIT_AMOUNT));
        try{account.withdraw(BigDecimal.valueOf(CUSTOMER_DEFAULT_DEPOSIT_AMOUNT).multiply(BigDecimal.TEN));}
        catch (OleBalanceException e) {
//            System.out.println(e.getMessage());
//            System.err.println("Have Sense");
           // throw new RuntimeException(e);
            Human human= Person.get();
            Human.run();
        }

    }
}