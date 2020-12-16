package com.hackathon.BankingApplication.services;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> saveC(Map<String, Object> customer) {
        Map<String, Object> cMap = jdbcTemplate.queryForMap("insert into customer(name,idcard,address,contact) values(?,?,?,?) RETURNING customerid",
                customer.get("name"),
                Long.parseLong((String) customer.get("idcard")),
                customer.get("address"),
                Long.parseLong((String) customer.get("contact")));
        customer.put("customerid", cMap.get("customerid"));
        return customer;
    }
}
