package com.rule.example;

import org.easyrules.api.RulesEngine;

import java.util.Scanner;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you a friend of duke?");
        String input = scanner.nextLine();
        MyRule helloWorldRule = new MyRule();

        helloWorldRule.setInput(input.trim());
        try {
            RulesEngine ruleEngine = aNewRulesEngine().build();
            ruleEngine.registerRule(helloWorldRule);
            ruleEngine.fireRules();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
