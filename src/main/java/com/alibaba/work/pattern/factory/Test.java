package com.alibaba.work.pattern.factory;

/**
 * @Desc
 * @Author 阿里P10大神退退
 * @date 2020/6/10 22:34
 */
public class Test {

    public static void main(String[] args) {
        PayFactory payFactory = new PayFactory();
        IPay alipay = payFactory.createPay(AliPay.class);
        alipay.pay();
    }
}
