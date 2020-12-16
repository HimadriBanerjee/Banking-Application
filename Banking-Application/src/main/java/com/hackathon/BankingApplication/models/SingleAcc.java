package com.hackathon.BankingApplication.models;
import com.hackathon.BankingApplication.enums.AccountType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SingleAcc extends Account {
    public SingleAcc(Long accountno,Long balance,Integer pin){
        super(accountno,balance,pin,AccountType.SINGLE);
    }
}

