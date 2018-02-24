import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    /*
     * 题目标题：A + B 问题
     * 题目内容：在控制台输入俩个整数，控制台输出这俩个整数的和；
     * 结果验证:
     * 输入:1 1 输出:2
     * 输入:2 3 输出:5
     * 输入:4 6 输出:10
     *
     */
    Scanner in = new Scanner(System.in);
    int A; int B; int sum;

    //提示: in.nextInt()表示 读取下一个输入的整数,如果是第一次读取则表示读取第一个输入的整数
    A = in.nextInt();
    B = in.nextInt();




          sum=A+B;
           System.out.print(sum);
    //提示: System.out.println();函数表示控制台输出,可以在控制台打印,可以参考HelloWorld.java
    //例如: System.out.println("结果为:");
  }
}
