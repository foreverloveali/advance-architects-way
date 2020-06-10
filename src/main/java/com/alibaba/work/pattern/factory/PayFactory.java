package com.alibaba.work.pattern.factory;

import java.util.Optional;

/**
 * @Desc
 * @Author 阿里P10大神退退
 * @date 2020/6/10 22:27
 */
public class PayFactory {

    public IPay createPay(Class<? extends IPay> iPay) {
        Optional<Class<? extends IPay>> payOptional = Optional.ofNullable(iPay);
        if (payOptional.isPresent()) {
            try {
                return iPay.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
