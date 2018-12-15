package com.issac.design.pattern.behavioral.interpreter;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        String issacInputStr = "6 100 11 + *";
        IssacExpressionParser expressionParser = new IssacExpressionParser();
        int result = expressionParser.parse(issacInputStr);
        System.out.println("解释器计算结果：" + result);
        
    }
}
