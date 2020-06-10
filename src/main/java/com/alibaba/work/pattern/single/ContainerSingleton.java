package com.alibaba.work.pattern.single;

import java.util.HashMap;

/**
 * @Desc 解决容器式单例的线程安全问题
 * @Author 阿里P10大神退退
 * @date 2020/6/9 23:02
 */
public class ContainerSingleton {

    private static HashMap<String, Object> map = new HashMap<String, Object>();

    private ContainerSingleton() {
    }

    /**
     * 方法1
     * @param className
     * @return
     */
    public synchronized static Object getInstance1(String className) {
        Object instance = null;
        if (!map.containsKey(className)) {
            try {
                instance = Class.forName(className).newInstance();
                map.put(className, instance);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            instance = map.get(className);
        }
        return instance;
    }

    /**
     * 方法2
     * @param className
     * @return
     */
    public static Object getInstance2(String className) {
        synchronized (ContainerSingleton.class) {
            Object instance = null;
            if (!map.containsKey(className)) {
                try {
                    instance = Class.forName(className).newInstance();
                    map.put(className, instance);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                instance = map.get(className);
            }
            return instance;
        }
    }
}
