package com.hackathon.BankingApplication.services;
import com.hackathon.BankingApplication.enums.AccountType;
import com.hackathon.BankingApplication.models.Account;
import com.hackathon.BankingApplication.models.TransactJPA;
import com.hackathon.BankingApplication.repository.TransactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class AccountService {
    private final JdbcTemplate jdbcTemplate;
    private final JointService jointService;
    private final SingleService singleService;
    public Map<String, Object> saveA(Map<String, Object> Account) {
        switch (AccountType.valueOf(String.valueOf(Account.get("AccountType")))) {
            case JOINT:
                return jointService.saveJ(Account);
            case SINGLE:
                return singleService.saveS(Account);
            default:
                return null;
        }
    }
}
