import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
//    private static final List<Book> LIST = new LinkedList<>();
    private static  List<Book> LIST;
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("我是线程：" + Thread.currentThread().getName());
            System.out.println("B我正在计算 0-10000 之间的数的和");
            int sum = 0;
            for (int i = 0; i <= 10000 ; i++) {
                sum += i;
            }
            System.out.println("B的结果："+sum);
        });
        t.start();

        System.out.println("我是线程：" + Thread.currentThread().getName());
        System.out.println("A我正在计算 0-10000 之间的数的和");
        int sum = 0;
        for (int i = 0; i <= 10000 ; i++) {
            sum += i;
        }
        System.out.println("A的结果："+sum);



//        Thread thread = new Thread(()-> {
//            int sum = 0;
//            for (int i = 0; i <= 100 ; i++) {
//                sum += i;
//            }
//            System.out.println("1-50的和为：" + sum);
//        });
//        thread.start();

//        new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("我是线程1");
//            }
//        }).start();
//
//        new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("我是线程2");
//            }
//        }).start();




//        load();
//        //图书管理系统
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            System.out.println("========== 图书管理系统 ==========");
//            System.out.println("1. 录入书籍信息");
//            System.out.println("2. 查阅书籍信息");
//            System.out.println("3. 删除书籍信息");
//            System.out.println("4. 修改书籍信息");
//            System.out.println("5. 退出系统");
//            System.out.println("========== <END> ==========");
//
//            switch (scanner.nextInt()){
//                case 1:
//                    insert(scanner);
//                    break;
//                case 2:
//                    list();
//                    break;
//                case 3:
//                    delete(scanner);
//                    break;
//                case 4:
//                    modify(scanner);
//                    break;
//                case 5:
//                    System.out.println("正在保存图书书籍...");
//                    save();
//                    System.out.println("退出使用...");
//                    return;
//            }
//
//
//
//        }

    }

//    @SuppressWarnings("uncheck")
//    private static void load(){
//        File file = new File("data");
//        if(file.exists()){
//            try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file))){
//                LIST = (List<Book>) stream.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }else {
//            LIST = new LinkedList<>();
//        }
//    }
//
//    // 数据保存
//    private static void save(){
//        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data"))){
//            stream.writeObject(LIST);
//            stream.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    private static void delete(Scanner scanner){
//        scanner.nextLine();
//        System.out.print("请输入你要删除的书籍ID编号：");
//        int index = scanner.nextInt();
//        scanner.nextLine();
//        while (index > LIST.size() - 1 || index < 0){
//            System.out.print("没有对应的书籍，请重新输入");
//            index = scanner.nextInt();
//            scanner.nextLine();
//        }
//        LIST.remove(index);
//        System.out.println("删除书籍信息成功！");
//    }
//
//    private static void modify(Scanner scanner){
//        scanner.nextLine();
//        System.out.println("请输入你要修改的书籍ID编号：");
//        int index = scanner.nextInt();
//        scanner.nextLine();
//        while (index > LIST.size() - 1 || index < 0){
//            System.out.print("没有对应的书籍，请重新输入");
//            index = scanner.nextInt();
//            scanner.nextLine();
//        }
//
//        Book book = LIST.get(index);
//        System.out.print("请输入书籍的标题");
//        book.setTitle(scanner.nextLine());
//        System.out.print("请输入书籍的作者");
//        book.setAuthor(scanner.nextLine());
//        System.out.print("请输入书籍的价格");
//        book.setPrice(scanner.nextInt());
//        scanner.nextLine();
//        System.out.print("书籍信息修改成功！");
//    }
//
//    private static void insert(Scanner scanner) {
//
////        String title = scanner.nextLine();
////        String author = scanner.nextLine();
////        int price = scanner.nextInt();
////        Book book = new Book(title, author, price);
//
//        scanner.nextLine();
//        System.out.print("请输入书籍的标题：");
//        String title = scanner.nextLine();
//        System.out.print("请输入书籍的作者：");
//        String author = scanner.nextLine();
//        System.out.print("请输入书籍的价格：");
//        int price = scanner.nextInt();
//        scanner.nextLine();
//        Book book = new Book(title, author, price);
//        LIST.add(book);
//        System.out.println("书籍信息添加成功: " + book);
//
//    }
//
//    private static void list(){
//        for (int i = 0; i < LIST.size(); i++) {
//            System.out.println(i+"."+LIST.get(i));
//        }
//    }
}