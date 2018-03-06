import java.util.Scanner;

public class  Problem5 {

  public static void main(String[] args)
  {
    /*
     * 题目:比较大小
     * 题目内容:给定两个整数A，B(1≤A,B≤1000)，请判断两数的关系。
     * 输入:
     * 第一行整数T表示测试数据组数。接下来T行每行两个整数分别表示A，B。 如果A<B输出Smaller，如果A=B输出Equal，如果A>B输出Bigger。
        输入例子:
        3
        4 5
        3 3
        4 3
        输出例子:
        Smaller
        Equal
        Bigger
     */

    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    String[] str = {"AAA", "BBB", "CCC"};
    for (int i = 0; i < T; i++)
          {

              int A = in.nextInt();
              int B = in.nextInt();



          if (A < B)
              {
                    str[i] = "Smaller";
              }
          if (A > B)
              {
                    str[i] = "Bigger";
              }
          if (A == B)
              {
                    str[i] = "Equal";
              }

          }
    for (int i = 0; i < T; i++)
          {
              System.out.println(str[i]);
          }
  }
}
