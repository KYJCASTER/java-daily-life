import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    /*
    1 name.trim().isEmpty()：
         trim()：去掉字符串首尾的空白字符（空格、换行符等）。
         isEmpty()：判断字符串是否为空字符串（长度为 0）。
     */
    if(name.trim().isEmpty()){
        System.out.println("You didn`t enter your name!");
    }
    else{
        System.out.println("Hello " + name +" !");
    }


    scanner.close();
}
}
