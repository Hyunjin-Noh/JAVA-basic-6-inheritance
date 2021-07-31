import java.util.Scanner;

public class Main2converter
{
  public static void main(String[] args) {
    Km2Mile toMile = new Km2Mile(1.6);//Km2MileŬ������ ��ü ����� ����, ���۷��� ������ toMile. 
    toMile.run();//run()�޼ҵ忡 ����. ratio�� 1.6���� ���������Ƿ�, run()�޼ҵ忡�� val/1.6�� ���� res�� ������ ��! (������ ���: km/1.6=mile)
  }
}
abstract class Converter {//Converter �߻�Ŭ����.
  abstract protected double convert(double src);
  abstract protected String getSrcString();
  abstract protected String getDestString();//src: =source, des: �ִ�
  //������� �߻�޼ҵ�. ����Ŭ�������� �����ؾ� ����Ŭ������ �߻�Ŭ������ �ȵ�. 
  protected double ratio;
  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
    System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
    double val = scanner.nextDouble();
    double res = convert(val);
    System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
    scanner.close();
  }
}
class Km2Mile extends Converter{//Converter �߻�Ŭ������ ��ӹ޴� ���� Ŭ���� Km2Mile.
	@Override
    protected double convert(double src) {return src/ratio;}
    protected String getSrcString() {return "Km";}
    protected String getDestString() {return "mile";}
    //�������, �߻�޼ҵ� ������!
    public Km2Mile(double ratio) {this.ratio=ratio;}
}
