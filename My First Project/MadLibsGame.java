import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        /*
       变量赋值记得放在变量使用前.
       变量 = scanner.nextLine放在sout使用该变量前.
         */
        Scanner scanner = new Scanner(System.in);

        // 变量声明
        String adjective1, noun1, adjective2, verb1, adjective3;

        // 获取用户输入
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (a person or an animal): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one more adjective (description): ");
        adjective3 = scanner.nextLine();

        // 生成 MadLibs 故事
        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("I met " + noun1 + ".");
        System.out.println("He is a " + adjective2 + " person.");
        System.out.println("He " + verb1 + " very " + adjective3 + ".");

        // 关闭 Scanner
        scanner.close();
    }
}
