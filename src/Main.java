import java.io.*;
import java.util.*;

public class Main {
    private static final List<Book> LIST = new LinkedList<>();
    public static void main(String[] args) {

        //图书管理系统
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("========== 图书管理系统 ==========");
            System.out.println("1. 录入书籍信息");
            System.out.println("2. 查阅书籍信息");
            System.out.println("3. 删除书籍信息");
            System.out.println("3. 修改书籍信息");
            System.out.println("5. 退出系统");
            System.out.println("========== <END> ==========");

            switch (scanner.nextInt()){
                case 1:
                    insert(scanner);
                    break;
                case 5:
                    System.out.println("退出使用");
                    break;
            }

        }

    }

    private static void insert(Scanner scanner) {

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        Book book = new Book(title, author, price);
    }
}