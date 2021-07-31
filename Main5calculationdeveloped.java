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