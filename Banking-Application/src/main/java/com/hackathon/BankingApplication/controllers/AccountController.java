package com.hackathon.BankingApplication.controllers;
import com.hackathon.BankingApplication.models.Account;
import com.hackathon.BankingApplication.models.SingleAcc;
import com.hackathon.BankingApplication.models.JointAcc;
import com.hackathon.BankingApplication.models.TransactJPA;
import com.hackathon.BankingApplication.services.AccountService;
import com.hackathon.BankingApplication.services.SingleService;
import com.hackathon.BankingApplication.services.JointService;
import com.hackathon.BankingApplication.services.TransactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "account")
public class AccountController {
    private final AccountService accountService;
    private final JointService jointService;
    private final SingleService singleService;
    private final TransactService transactService;

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> accountDetail (@RequestBody Map < String, Object > account){
        return accountService.saveA(account);}

    @PostMapping(path = "transact",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> transactDetails(@RequestBody Map<String,Object>transactJPA){
        return (Map<String, Object>) transactService.saveTransact((TransactJPA) transactJPA);
    }
}
