package com.alibaba.work.pattern.factory;

/**
 * @Desc
 * @Author 阿里P10大神退退
 * @date 2020/6/10 22:32
 */
public class WeChatPay implements IPay{

    public void pay() {
        System.out.println("微信支付...");
    }
}
