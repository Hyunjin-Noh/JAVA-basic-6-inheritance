public class Main3colorblackandred {
  public static void main(String[] args) {
    ColorPoint zeroPoint = new ColorPoint(); //(0,0)��ġ�� BLACK�� ��.
    System.out.println(zeroPoint.toString() + "�Դϴ�.");
    
    ColorPoint cp = new ColorPoint(10, 10);//(10, 10)��ġ�� BLACK�� ��.
    
    cp.setXY(5, 5);
    cp.setColor("RED");
    System.out.println(cp.toString() + "�Դϴ�.");//RED���� (5,5)�� ���Դϴ�.
  }
}
class Point {
  private int x, y;
  public Point(int x, int y) { this.x = x; this.y = y; }//PointŬ������ ������. x, y�� �Ű������� ����.
  
  public int getX() { return x; }
  public int getY() { return y; }
  //PointŬ������ ��� �޼ҵ�. ���� private ��� �ʵ� x, y���� ��ȯ��.
  
  protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super(0,0);
		this.color="BLACK";}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color="BLACK";}
	//�� Ư���� ������ �Ѥ���....
	public void setColor(String color) {this.color = color;}
	//ColorPointŬ������ ��� �޼ҵ�. private ��� �ʵ� color���� ��ȯ��.
	
	public void setXY(int x, int y) {move(x, y);}//�Ʊ� �� Ư���� �����ڷ� BLACK(10,10)�� �ش���ѳ��� �ű���� move�� �ű�����������....���ŷӰԤ���
	public String toString() {
		String tmp = color+"���� "+"("+getX()+","+getY()+")"+"�� ��";//�� ����Ŭ������ private������ �����Ϸ��� �̸� ����� getter�̿��ؾ���!
		return tmp;}//String�� return�ϴ� ����� String ���� tmp�� �����س��� �����ϴ� �ű���!!
}
