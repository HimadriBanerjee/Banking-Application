package com.hackathon.BankingApplication.services;
import com.hackathon.BankingApplication.models.TransactJPA;
import com.hackathon.BankingApplication.repository.TransactRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class TransactService {
    private final TransactRepository transactRepository;
    public TransactService(TransactRepository transactRepository) {
        this.transactRepository = transactRepository;
    }

    public TransactJPA saveTransact(TransactJPA transactJPA) {
        return transactRepository.save(transactJPA);
    }
    public TransactJPA getTransactionByAccountNo(Long accountno) {
        Optional<TransactJPA> transact = transactRepository.findById(accountno);
        if (transact.isPresent()) {
            return transact.get();
        }
        return null;
    }
}
