package com.hackathon.BankingApplication.controllers;
import com.hackathon.BankingApplication.models.Customer;
import com.hackathon.BankingApplication.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> customerDetail (@RequestBody Map < String, Object > customer){
        return customerService.saveC(customer);}
}
