import java.util.Scanner;
public class Main4stacktotal {
  public static void main(String[] args) {
      StackApp.run();/*StackAppŬ������ run()�޼ҵ忡�� ����. ���۷��� ���� ����, ���� ���ص� �ǳ�?*/
  }
}
interface Stack {
  int length(); // ���� ���ÿ� ����� ���� ����
  int capacity(); // ������ ��ü ���� ������ ���� ����
  String pop(); // ������ ��(top)�� �Ǽ� ����
  boolean push(String val); // ������ ��(top)�� ����� �Ǽ� ����
}
class StringStack implements Stack {//interface ������(����ǹ�) Ŭ���� StringStack.
   private int num; // ���� ������ ����
   private int set; // ���� �ε���
   private String[] stack;//String�� �����ϴ� �迭 ����, ���۷��� ������ stack.
   
   public StringStack(int num) {
      this.num = num;
      this.set = 0;
      stack = new String[num];//num���� �迭 ����.
   }//num�� �Ű������� �ϴ� ������
   
   public int length() {return set;}
   public int capacity() {return stack.length;}
   
   public String pop() {
      if(set-1 < 0) return null; // stack�� �ƹ��͵� ���� �ʾ��� ��
      set--; // stack ��ĭ�� ������ (stack[set]�� ������� ����Ű�� �����ϱ�)
      String s = stack[set]; // �� ���� ��
      return s;
   }
   public boolean push(String val) {
      if(set < num) {
         stack[set] = val; //�� ���� ���ڿ��� �־���
         set++; // stack ��ĭ�� �÷���
         return true;
      }
      else return false;
   }
}
class StackApp {
  public static void run() {
      Scanner sc = new Scanner(System.in);
      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
      int num;
      num = sc.nextInt();
      StringStack stack = new StringStack(num);
      while(true) {
         System.out.print("���ڿ� �Է� >> ");
         String val = sc.next();
         if(val.equals("�׸�")) break;
         if(!stack.push(val)) System.out.println("������ �� ���� Ǫ�� �Ұ�!");
      }
      System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
      int len;
      len = stack.length();
      for(int i=0; i<len; i++) {
         String s = stack.pop();
         System.out.print(s+" ");}
      sc.close();
  }
}

