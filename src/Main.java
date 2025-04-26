import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        try(BufferedWriter stream = new BufferedWriter(new FileWriter("test.txt"))){
            stream.write("Hello World");
            stream.newLine();
            stream.write("Hello World");
            stream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

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