package io.fp.atm;

public class AccountDetails {
    
    private String iban;
    private String bic;

    public AccountDetails(String iban, String bic){
        this.iban = iban;
        this.bic = bic;
    }
}
