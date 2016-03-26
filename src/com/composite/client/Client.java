package com.composite.client;

import com.composite.child.ConcreateCompany;
import com.composite.child.FinanceDepartment;
import com.composite.child.HRDepartment;
import com.composite.father.Company;

/**
 * Created by zzp on 2016/1/29.
 */
public class Client {
    public static void main(String[] args) {
        Company root = new ConcreateCompany("北京联创智荣信息技术有限公司");

        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        Company west = new ConcreateCompany("西南区域");
        west.add(new FinanceDepartment("西南区域财务部"));
        west.add(new HRDepartment("西南区域人力资源部"));

        Company east = new ConcreateCompany("华东区域");
        east.add(new HRDepartment("华东区域人力资源部"));
        east.add(new FinanceDepartment("华东区域财务部"));
        root.add(west);
        root.add(east);


        System.out.println("结构图：");
        root.display(2);

        System.out.println("\n职能");
        root.lineOfDuty();
    }
}
