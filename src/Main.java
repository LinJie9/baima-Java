// import com.test.entity.Student;
// import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
// import java.io.*;
// import java.lang.reflect.Constructor;
// import java.lang.reflect.Field;
// import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;
// import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) {


        int[] arr = new int[]{3, 5, 7, 8, 1, 2, 9};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));




//        Class<?>clazz1 = com.test.entity.Student.class;
//        Class<?>clazz2 = Class.forName("com.test.entity.Student");
//        Class<com.test.entity.Student> clazz3 = com.test.entity.Student.class;
//
//        System.out.println(clazz1 == clazz2);
//        System.out.println(clazz3 == clazz2);

//        Class<com.test.entity.Student> clazz = com.test.entity.Student.class;
//        Constructor<com.test.entity.Student>constructor = clazz.getConstructor(String.class, int.class);
//        constructor.setAccessible(true); // 加了就可以访问了
//        com.test.entity.Student student = constructor.newInstance("小米", 18);
//        student.test();
//        System.out.println(student);
//        student.test();


//        Class<com.test.entity.Student>clazz = com.test.entity.Student.class;
//        Method test = clazz.getMethod("test");
//        test.invoke(new com.test.entity.Student("小明", 19));

//        Class<com.test.entity.Student> clazz = com.test.entity.Student.class;
//        Method test = clazz.getMethod("test");
//        test.invoke(new com.test.entity.Student("小明", 21));

//        Class<?> clazz = Class.forName("com.test.entity.Student");
//        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
//        Object o = constructor.newInstance("小明", 19);
//        Method test = clazz.getMethod("test");
//        System.out.println(test.invoke(o));


//        Class<?> clazz = Class.forName("com.test.entity.Student");
//        Field name = clazz.getDeclaredField("age");
//        name.setAccessible(true);
//        System.out.println(name.get(new Student("小明", 23)));

//            Method test = Student.class.getDeclaredMethod("test");
//            test.invoke(Student.class);
    }



//private static final List<Book> LIST = new LinkedList<>();
//private static  List<Book> LIST;
//private static int value = 0;
//private static int i = 0;
//
//private static synchronized void add(){
//    i++;
//}

//public static void main(String[] args) throws InternalException, InterruptedException {


//    private static final Queue<Object> queue = new LinkedList<>();

//    public static void main(String[] args) {
//        new Thread(Main::add, "厨师1").start();
//        new Thread(Main::add, "厨师2").start();
//
//        new Thread(Main::take, "消费者1").start();
//        new Thread(Main::take, "消费者2").start();
//        new Thread(Main::take, "消费者3").start();
//    }

//    private static void add(){
//        while (true){
//            try{
//              Thread.sleep(3000);
//              synchronized (queue){
//                  String name = Thread.currentThread().getName();
//                  System.out.println(new Date() + " " + name + "鸡汤来喽！");
//                  queue.offer(name);
//                  queue.notify();
//              }
//            }catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//    private static void take(){
//        while (true){
//            try{
//                synchronized (queue){
//                    while (queue.isEmpty())queue.wait();
//                    queue.poll();
//                    String name = Thread.currentThread().getName();
//                    System.out.println(new Date() + " " + name + "拿到了餐品，正在享用");
//                }
//
//                Thread.sleep(4000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        }
//    }


//    Timer timer = new Timer();
//    timer.schedule(new TimerTask() {
//        @Override
//        public void run() {
//            System.out.println("我是延迟任务");
//        }
//    },1000, 1000);
//    Thread.sleep(5000);
//    timer.cancel();


//        new Thread(() -> {
//            for (int j = 0; j < 100000; j++) {
//                add();
//            }
//        }).start();
//
//    new Thread(() -> {
//        for (int j = 0; j < 100000; j++) {
//            add();
//        }
//    }).start();
//
//    new Thread(() -> {
//        for (int j = 0; j < 100000; j++) {
//            synchronized (Main.class) {
//                i++;
//            }
//        }
//    }).start();
//
//
//    Thread.sleep(1000);
//    System.out.println(i);


//        new Thread(() -> {
//            for (int j = 0; j < 10000; j++) {
//                i++;
//            }
//        }).start();
//
//        new Thread(() -> {
//            for (int j = 0; j < 10000; j++) {
//                i++;
//            }
//        }).start();
//
//        Thread.sleep(1000);
//        System.out.println(i);
        
//        Main main1 = new Main();
//        Main main2 = new Main();
//
//        Thread t1 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++){
//                synchronized (main1) {
//                    value++;
//                }
//            }
//            System.out.println("线程1完成");
//        });
//
//        Thread t2 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++){
//                synchronized (main2) {
//                    value++;
//                }
//            }
//            System.out.println("线程1完成");
//        });
        
        
//        Thread t = new Thread(() -> {
//            System.out.println("我是线程：" + Thread.currentThread().getName());
//            System.out.println("B我正在计算 0-10000 之间的数的和");
//            int sum = 0;
//            for (int i = 0; i <= 10000 ; i++) {
//                sum += i;
//            }
//            System.out.println("B的结果："+sum);
//        });
//        t.start();
//
//        System.out.println("我是线程：" + Thread.currentThread().getName());
//        System.out.println("A我正在计算 0-10000 之间的数的和");
//        int sum = 0;
//        for (int i = 0; i <= 10000 ; i++) {
//            sum += i;
//        }
//        System.out.println("A的结果："+sum);



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

//    }

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