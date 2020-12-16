package com.hackathon.BankingApplication.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "transaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionid;
    private Long amount;
    private Timestamp transtime;
}
