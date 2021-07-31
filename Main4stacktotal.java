import java.util.Scanner;
public class Main4stacktotal {
  public static void main(String[] args) {
      StackApp.run();/*StackApp클래스의 run()메소드에만 접근. 레퍼런스 변수 선언, 생성 안해도 되나?*/
  }
}
interface Stack {
  int length(); // 현재 스택에 저장된 개수 리턴
  int capacity(); // 스택의 전체 저장 가능한 개수 리턴
  String pop(); // 스택의 톱(top)에 실수 저장
  boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack {//interface 구현한(상속의미) 클래스 StringStack.
   private int num; // 저장 가능한 개수
   private int set; // 저장 인덱스
   private String[] stack;//String을 저장하는 배열 선언, 레퍼런스 변수는 stack.
   
   public StringStack(int num) {
      this.num = num;
      this.set = 0;
      stack = new String[num];//num행의 배열 생성.
   }//num을 매개변수로 하는 생성자
   
   public int length() {return set;}
   public int capacity() {return stack.length;}
   
   public String pop() {
      if(set-1 < 0) return null; // stack에 아무것도 넣지 않았을 떄
      set--; // stack 한칸을 내려줌 (stack[set]은 빈공간을 가리키고 있으니깐)
      String s = stack[set]; // 맨 위의 값
      return s;
   }
   public boolean push(String val) {
      if(set < num) {
         stack[set] = val; //맨 위에 문자열을 넣어줌
         set++; // stack 한칸을 올려줌
         return true;
      }
      else return false;
   }
}
class StackApp {
  public static void run() {
      Scanner sc = new Scanner(System.in);
      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
      int num;
      num = sc.nextInt();
      StringStack stack = new StringStack(num);
      while(true) {
         System.out.print("문자열 입력 >> ");
         String val = sc.next();
         if(val.equals("그만")) break;
         if(!stack.push(val)) System.out.println("스택이 꽉 차서 푸시 불가!");
      }
      System.out.print("스택에 저장된 모든 문자열 팝 : ");
      int len;
      len = stack.length();
      for(int i=0; i<len; i++) {
         String s = stack.pop();
         System.out.print(s+" ");}
      sc.close();
  }
}

