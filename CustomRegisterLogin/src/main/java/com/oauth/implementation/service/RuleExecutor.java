package com.oauth.implementation.service;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import com.oauth.implementation.model.Rule;

public class RuleExecutor {

    public static void executeRules(int age) {
        // Create a Rules object and add the rule
        Rules rules = new Rules();
        rules.register(new Rule());

        // Create Facts object and add the required facts
        Facts facts = new Facts();
        facts.put("age", age);

        // Create a Rules Engine and fire the rules on the facts
        DefaultRulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);
    }
}
