import java.util.Scanner;
public class SeconD {
public static void main(String[] args){
    /*
   一些需要注意的问题
   1·当一个scanner的下方有scanner.nextline的时候需要在这个scanner的下方加一行：scanner。nextLine（）;
      例：
      sout（"your age is " + age）;
      int age = scanner.nextInt();
      scanner.nextLine();

      sout()
      String name = scanner.nextLine();
     因为enter是换行相当于一行space 如果不在第一个scanner后加scanner.nextline();则会使name = \n
 */
    double width = 0;
    double height = 0;
    double area = 0;
Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the width: ");
    width = scanner.nextDouble();
    System.out.print("Enter the hight: ");
    height = scanner.nextDouble();
    area = width * height;
    System.out.println("The area is:" + area + "cm²");


scanner.close();

}
}
