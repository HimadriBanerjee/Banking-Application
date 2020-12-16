package com.hackathon.BankingApplication.services;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class SingleService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> saveS(Map<String, Object> single){
    Map<String, Object> sMap = jdbcTemplate.queryForMap("insert into account(accountno,balance,pin,AccountType) values(?,?,?,?) RETURNING accountid",
            Long.parseLong((String) single.get("accountno")),
            Long.parseLong((String) single.get("balance")),
            Integer.parseInt((String) single.get("pin")),
            single.get("AccountType"));
        single.put("accountid", sMap.get("accountid"));
        return single;
}
}
