import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            add(str);
            System.out.println("文档格式正确，add方法执行成功");
        } catch (FileNotFoundException e) {
            System.out.println("捕获到异常：" + e.getMessage());
            System.out.println("提示：请提供以 .txt 结尾的文件名");
        }finally {
            System.out.println("----------进入finally块----------");
            delete();
        }

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
