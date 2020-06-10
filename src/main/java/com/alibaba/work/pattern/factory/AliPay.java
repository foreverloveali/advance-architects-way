package com.alibaba.work.pattern.factory;

/**
 * @Desc
 * @Author 阿里P10大神退退
 * @date 2020/6/10 22:31
 */
public class AliPay implements IPay{

    public void pay() {
        System.out.println("支付宝支付...");
    }
}
