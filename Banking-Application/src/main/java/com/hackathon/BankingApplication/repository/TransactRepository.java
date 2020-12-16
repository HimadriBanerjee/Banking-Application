package com.hackathon.BankingApplication.repository;
import com.hackathon.BankingApplication.models.TransactJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactRepository extends JpaRepository<TransactJPA, Long> {
}
