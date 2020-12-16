package com.hackathon.BankingApplication.models;
import com.hackathon.BankingApplication.enums.AccountType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class JointAcc extends Account {
    private String name1;
    private Long idcard1;
    private String address1;
    private Long contact1;

    public JointAcc(Long accountno,Long balance,Integer pin){
     super(accountno,balance,pin,AccountType.JOINT);
     this.name1=name1;
     this.idcard1=idcard1;
     this.address1=address1;
     this.contact1=contact1;
    }
}
