import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) {
    //用于控制台输入
    Scanner in = new Scanner(System.in);
    String userName = in.next();
    //控制台输出(打印) hello, 输入的文字! 并换行
    System.out.println("hello, " + userName + "!");
    //控制台输出(打印),但是不换行
    System.out.print("hello, " + userName + "!");
    System.out.print("测试没有换行");
    //一下俩种方式都表示控制台输出换行
    System.out.println("");
    System.out.print("测试换行了");
    System.out.print("\n");
    System.out.print("测试换行了2");
  }
}
