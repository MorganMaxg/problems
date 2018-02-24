import java.util.Scanner;

public class Problem4 {

  public static void main(String[] args) {
    /*
     * 题目:if的使用
     * 题目内容:判断一个数是奇数还是偶数,如果是偶数则输出"xx是偶数",如果是奇数则输出"xx是奇数"
     * 结果验证:
     * 输入:4 输出:4是偶数
     * 输入:15 输出:15是奇数
     */
    Scanner in = new Scanner(System.in);
    int a ;
    a= in.nextInt();
    if(a%2==1)
    {

      System.out.print(a+"是奇数");

    }
    if(a%2==0)
    {

      System.out.print(a+"是偶数");

    }
  }
}
