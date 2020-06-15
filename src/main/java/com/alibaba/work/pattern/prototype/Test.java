package com.alibaba.work.pattern.prototype;

public class Test {

    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.setId(1);
//        student1.setName("退退");
//        student1.setAge(24);
//        student1.setDate("2020-06-11");
//        Student student2 = (Student) BeanUtils.getInstance(student1);
//        System.out.println(student1);
//        System.out.println(student2);
//        Student student3 = (Student) student1.clone();
//        System.out.println(student3);
//        System.out.println();
        String a = "hello";
        String b = a.intern();
        System.out.println(a == b);
    }
}
