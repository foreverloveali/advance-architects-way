package com.alibaba.work.pattern.prototype;

import java.lang.reflect.Field;

public class BeanUtils {

    /**
     * 将一个实体类的字段的值复制一份
     * @param prototype
     * @return
     */
    public static Object getInstance(Object prototype) {
        Class clazz = prototype.getClass();
        Object instance = null;
        try {
            instance = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(instance, field.get(prototype));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
