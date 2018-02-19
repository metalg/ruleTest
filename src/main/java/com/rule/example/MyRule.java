package com.rule.example;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 * Created by german on 4/4/16.
 */
@Rule(name = "Hellow world rule", description="Say hello to duke's friends only")
public class MyRule {
    private String input;

    @Condition
    public boolean checkInput() {
        return input.equalsIgnoreCase("yes");
    }

    @Action
    public void sayHelloToDukeFriend() throws Exception {
        System.out.println("Hello duke's friend!s");
    }

    public void setInput(String intput) {
        this.input = intput;
    }
}
