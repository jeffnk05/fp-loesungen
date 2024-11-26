package io.fp.atm;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Account> accountList = new ArrayList<>();
    CashCard cashCard;
    private Account selectedAccount;
    private State state;

    public CashMachine(ArrayList<Account> accountList){
        this.accountList = accountList;
        state = State.READY;
    }
}
