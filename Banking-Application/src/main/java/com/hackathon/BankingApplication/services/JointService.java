package com.hackathon.BankingApplication.services;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class JointService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> saveJ(Map<String, Object> joint){
    Map<String, Object> jMap = jdbcTemplate.queryForMap("insert into account(accountno,balance,pin,AccountType) values(?,?,?,?) RETURNING accountid",
            Long.parseLong((String) joint.get("accountno")),
            Long.parseLong((String) joint.get("balance")),
            Integer.parseInt((String) joint.get("pin")),
            joint.get("AccountType"));
        joint.put("accountid", jMap.get("accountid"));
        return joint;
}
}
