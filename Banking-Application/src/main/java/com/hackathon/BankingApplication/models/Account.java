package com.hackathon.BankingApplication.models;
import com.hackathon.BankingApplication.enums.AccountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long accountno;
    private Long balance;
    private Integer pin;
    private AccountType accountType;

   public Account(Long accountno, Long balance, Integer pin){
        this.accountno=accountno;
       this.balance=balance;
        this.pin=pin;
    }
}
