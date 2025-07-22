package com.test.entity;

public class Student {

    String name;
    int age;

    public Student(String test){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public static void test(){
        System.out.println("我是静态方法");
    }


//    public void test(){
//        System.out.println("Hello test");
//        System.out.println(name + " " + age);
//    }
}
