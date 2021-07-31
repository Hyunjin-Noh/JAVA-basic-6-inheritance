import java.util.Scanner;

public class Main5calculationdeveloped {
  public static void main (String args[]) {
	  System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
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
    	  if (y==0) System.out.println("����� �� �����ϴ�.");
    	  else {
    		  calc = new Div();
    		  calc.setValue(x, y);
    	      System.out.println(calc.calculate());}
          break;
      default:
          System.out.println("�߸��� �������Դϴ�.");
          break;
      }
      sc.close();
  }
}
abstract class Calc {//�߻� Ŭ����
	protected int a,b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    abstract int calculate();//�߻� �޼ҵ�
}

class Add extends Calc {public int calculate(){return a+b;}}
class Sub extends Calc {public int calculate(){return a-b;}}
class Mul extends Calc {public int calculate(){return a*b;}}
class Div extends Calc {public int calculate(){return a/b;}}
//�� ���� Ŭ�������� �߻� �޼ҵ带 ������.