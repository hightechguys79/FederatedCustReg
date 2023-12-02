package com.oauth.implementation.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oauth.implementation.service.RuleExecutor;

@RestController
@RequestMapping("/rules")
public class RuleController {

    @GetMapping("/execute/{age}")
    public ResponseEntity<String> executeRule(@PathVariable int age) {
        try {
            RuleExecutor.executeRules(age);
            return ResponseEntity.ok("Rule executed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error executing rule: " + e.getMessage());
        }
    }
}
