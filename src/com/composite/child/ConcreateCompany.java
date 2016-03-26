package com.composite.child;

import com.composite.father.Company;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzp on 2016/1/29.
 */
public class ConcreateCompany extends Company {

    private List<Company> companies = new ArrayList<Company>();

    public ConcreateCompany(String name){
        this.name = name;
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.rightPad("", depth, "-") + this.name);
        for (Company company : companies) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : companies) {
            company.lineOfDuty();
        }
    }

    public static void main1(String[] args) {
        String str=null;
        str=String.format("Hi,%s", "王力");
        System.out.println(str);
        str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');


        //$使用
        str=String.format("格式参数$的使用：%1$d,%2$s", 99,"abc");
        System.out.println(str);
        //+使用
        System.out.printf("显示正负数的符号：%+d与%d%n", 99,-99);
        //补O使用
        System.out.printf("最牛的编号是：%03d%n", 7);
        //空格使用
        System.out.printf("Tab键的效果是：% 8d%n", 7);
        //.使用
        System.out.printf("整数分组的效果是：%,d%n", 9989997);
        //空格和小数点后面个数
        System.out.printf("一本书的价格是：% 50.5f元%n", 49.8);
        System.out.printf("整数分组的效果是：%,12.3f%n", 9989997.12);
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.rightPad("--", 2, "--"));
    }
}
