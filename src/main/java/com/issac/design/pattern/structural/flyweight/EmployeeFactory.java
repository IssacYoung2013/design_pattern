package com.issac.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * author:  ywy
 * date:    2018-12-14
 * desc:
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(manager == null) {
            manager = new Manager(department);
            String reportContent = department + "部门汇报：此次报告的主要内容";
            manager.setReportContent(reportContent);
            EMPLOYEE_MAP.put(department,manager);
            System.out.println("创建部门经理");
            System.out.println(" 创建报告：" + reportContent);
        }
        return manager;
    }
}
