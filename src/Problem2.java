import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    /*
     * 题目: for循环的使用
     * 题目内容: 输入俩个整数a,b(a < b),输出这俩个整数(含)之前的所有数字
     * 提示:输入和输出可以参考HelloWorld.java
     * 结果验证:
     * 输入:1 9 输出:1 2 3 4 5 6 7 8 9
     * 输入:5 8 输出:5 6 7 8
     */
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    for (int i = a; i < b + 1; i++) {
      System.out.print(i + " ");
    }
  }
}
