package com.alibaba.work.pattern.factory;

/**
 * @Desc
 * @Author 阿里P10大神退退
 * @date 2020/6/10 22:34
 */
public class UnionPay implements IPay{

    public void pay() {
        System.out.println("银联支付...");
    }
}
