package 둘째날;

import java.util.Scanner;
public class casetest{
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("15이하 숫자를 입력하세요:");
      int num = sc.nextInt();

      switch(num){
          case 1:
          case 3:
          case 5:
          case 7:
          case 9:
          case 11:
          case 13:
          case 15:
              System.out.println("홀수입니다.");
              break;
          default:
              if(num > 15){
                  System.out.println("15이하 숫자를 입력하세요.");
              } else {
                  System.out.println("홀수는 아니네요");
              }
              break;
      }
    }
}

// 힌트: 코드가 실행되게 주석을 없애면 된다.
// 미션 1:
// case 문을 이용하여 입력된 수가 15이하 짝수일 경우,
// "짝수입니다"를 출력한다.

