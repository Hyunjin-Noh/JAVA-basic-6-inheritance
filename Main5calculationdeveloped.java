/*p.320 실습문제11
철수 학생은 다음 3개의 필드와 메소드를 가진 
4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다. (4주차 과제 참고).

¤int 타입의 a, b필드 : 2개의 피연산자
¤void setValue(int a, int b) : 피연산자 값을 객체 내에 저장한다.
¤int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

곰곰히 생각해 보니, Add, Sub, Mul, Div클래스에 공통된 필드와 메소드가 존재하므로 
새로운 추상클래스 Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다.
그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력 받은 후 
Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 
setValue()와 calculate()를 호출하여 그 결과 값을 화면에 출력하면 된다고 생각하였다.
철수처럼 프로그램을 작성하라.
*/

import java.util.Scanner;

public class Main5calculationdeveloped {
  public static void main (String args[]) {
	  System.out.print("두 정수와 연산자를 입력하시오>>");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      char ch = sc.next().charAt(0);
      Calc calc;
      switch(ch){
      case '+':
          calc = new Add();
          calc.setValue(x, y);
          System.out.println(calc.calculate());
          break;
      case '-':
          calc = new Sub();
          calc.setValue(x, y);
          System.out.println(calc.calculate());
          break;
      case '*':
          calc = new Mul();
          calc.setValue(x, y);
          System.out.println(calc.calculate());
          break;
      case '/':
    	  if (y==0) System.out.println("계산할 수 없습니다.");
    	  else {
    		  calc = new Div();
    		  calc.setValue(x, y);
    	      System.out.println(calc.calculate());}
          break;
      default:
          System.out.println("잘못된 연산자입니다.");
          break;
      }
      sc.close();
  }
}
abstract class Calc {//추상 클래스
	protected int a,b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    abstract int calculate();//추상 메소드
}

class Add extends Calc {public int calculate(){return a+b;}}
class Sub extends Calc {public int calculate(){return a-b;}}
class Mul extends Calc {public int calculate(){return a*b;}}
class Div extends Calc {public int calculate(){return a/b;}}
//각 서브 클래스마다 추상 메소드를 구현함.
