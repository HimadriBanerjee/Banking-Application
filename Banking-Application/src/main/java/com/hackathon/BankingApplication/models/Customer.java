package com.hackathon.BankingApplication.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    private String name;
    private Long idcard;
    private String address;
    private Long contact;

    public Customer(String name,Long idcard,String address,Long contact) {
        this.name = name;
        this.idcard = idcard;
        this.address = address;
        this.contact = contact;
    }
}
