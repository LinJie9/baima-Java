import java.util.*;
import java.util.stream.Collectors;

//package com.test;

import java.io.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        


//        File file = new File("text.txt");
//        System.out.println(file.delete());




//        try(FileOutputStream stream = new FileOutputStream("text.txt",true)){
////            stream.write('A'); //单字符要用单引号
////            stream.write("Hello World"); //多个字符，会报错
//            stream.write("Hello World!".getBytes());
//        } catch (IOException e){
//            e.printStackTrace();
//        }


        

//        Random random = new Random();
//        random.ints(-100, 100)
//                .limit(20)
//                .filter(i -> i >= 0)
//                .sorted()
//                .forEach(System.out::println);

//        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bbb","lbwnb", "AAAA", "BBBZS"));
//        list = list.stream()
//                .filter(str -> str.length() > 3)
//                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(list);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "小明");
//        map.put(2, "小红");
//        map.put(3, "小李");
//        System.out.println(map.get(1));

//        Set<Integer> set = new TreeSet<>((a, b) -> b - a); //比较，从大到小
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        for (Integer i : set){
//            System.out.println(i);
//        }

//            Set<String> set = new LinkedHashSet<>(); //顺序排序
//            set.add("AAA");
//            set.add("CCC");
//            set.add("DDD");
//            for (String s : set){
//                System.out.println(s);
//            }


//        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C"));
//        list.forEach(str -> System.out.println(str));


//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println((String) iterator.next());
//        }

//        System.out.println("Hello world!");
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add(0, "AAA");
//        list.add(0, "BBB");
//        System.out.println(list);

//        List<String> list = new ArrayList<>();
//        list.add("AAA");
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.remove("AAA"));
//        System.out.println(list);




    }
}


//public class Student {
//    Integer sid;
//    String name;
//    String sex;
//
//    public Student(Integer sid, String name, String sex) {
//        this.sid = sid;
//        this.name = name;
//        this.sex = sex;
//    }
//
//    public void say(){
//        System.out.println("我叫:" +name+",学号为:"+sid+",性别是"+sex);
//    }
//}