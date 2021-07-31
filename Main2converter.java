import java.util.Scanner;

public class Main2converter
{
  public static void main(String[] args) {
    Km2Mile toMile = new Km2Mile(1.6);//Km2Mile클래스의 객체 선언과 생성, 레퍼런스 변수는 toMile. 
    toMile.run();//run()메소드에 접근. ratio를 1.6으로 설정했으므로, run()메소드에서 val/1.6인 값이 res가 나오게 됨! (저명한 사실: km/1.6=mile)
  }
}
abstract class Converter {//Converter 추상클래스.
  abstract protected double convert(double src);
  abstract protected String getSrcString();
  abstract protected String getDestString();//src: =source, des: 주다
  //여기까지 추상메소드. 서브클래스에서 구현해야 서브클래스가 추상클래스가 안됨. 
  protected double ratio;
  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
    System.out.print(getSrcString() + "을 입력하세요>> ");
    double val = scanner.nextDouble();
    double res = convert(val);
    System.out.println("변환 결과: " + res + getDestString() + "입니다.");
    scanner.close();
  }
}
class Km2Mile extends Converter{//Converter 추상클래스를 상속받는 서브 클래스 Km2Mile.
	@Override
    protected double convert(double src) {return src/ratio;}
    protected String getSrcString() {return "Km";}
    protected String getDestString() {return "mile";}
    //여기까지, 추상메소드 구현함!
    public Km2Mile(double ratio) {this.ratio=ratio;}
}
