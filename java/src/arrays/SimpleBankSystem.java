package arrays;

import java.util.ArrayList;
import java.util.List;

public class SimpleBankSystem {

    public class Bank {

        List<Long> accountList = new ArrayList<>();

        public Bank(long[] balance) {
            for(int i = 0; i < balance.length;i++){
                accountList.add(balance[i]);
            }
        }

        public boolean transfer(int account1, int account2, long money) {
            account1 = account1 -1;
            account2 = account2 -1;
            if(account1 >= accountList.size() || account2 >= accountList.size())
                return false;
            long acc1Balance = accountList.get(account1);
            if(acc1Balance < money)
                return false;

            accountList.set(account1, acc1Balance - money);
            long acc2Balance = accountList.get(account2);
            accountList.set(account2, acc2Balance + money);
            return true;
        }

        public boolean deposit(int account, long money) {
            account = account -1;
            if(account >= accountList.size())
                return false;
            long accBalance = accountList.get(account);
            accountList.set(account, accBalance + money);
            return true;
        }

        public boolean withdraw(int account, long money) {
            account = account -1;
            if(account >= accountList.size())
                return false;
            long accBalance = accountList.get(account);
            if(accBalance < money)
                return false;
            accountList.set(account, accBalance - money);
            return true;
        }
    }
}
