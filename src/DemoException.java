import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        add(str);
        delete();
    }

    private static void add(String str) throws FileNotFoundException {
        if (!str.endsWith(".txt")) {
            throw new FileNotFoundException("找不到文档");
        }
        System.out.println("执行add");
    }

    private static void delete() {
        System.out.println("执行delete");
    }
}
