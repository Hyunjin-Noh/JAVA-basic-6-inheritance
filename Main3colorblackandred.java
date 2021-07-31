public class Main3colorblackandred {
  public static void main(String[] args) {
    ColorPoint zeroPoint = new ColorPoint(); //(0,0)위치의 BLACK색 점.
    System.out.println(zeroPoint.toString() + "입니다.");
    
    ColorPoint cp = new ColorPoint(10, 10);//(10, 10)위치의 BLACK색 점.
    
    cp.setXY(5, 5);
    cp.setColor("RED");
    System.out.println(cp.toString() + "입니다.");//RED색의 (5,5)의 점입니다.
  }
}
class Point {
  private int x, y;
  public Point(int x, int y) { this.x = x; this.y = y; }//Point클래스의 생성자. x, y를 매개변수로 가짐.
  
  public int getX() { return x; }
  public int getY() { return y; }
  //Point클래스의 멤버 메소드. 각각 private 멤버 필드 x, y값을 반환함.
  
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
	//좀 특별한 생성자 둘ㅎㅎ....
	public void setColor(String color) {this.color = color;}
	//ColorPoint클래스의 멤버 메소드. private 멤버 필드 color값을 반환함.
	
	public void setXY(int x, int y) {move(x, y);}//아까 그 특별한 생성자로 BLACK(10,10)에 해당시켜놓고 옮기려고 move쓴 거구나ㅎㅎㅎㅎ....번거롭게ㅎㅎ
	public String toString() {
		String tmp = color+"색의 "+"("+getX()+","+getY()+")"+"의 점";//꼭 슈퍼클래스의 private변수에 접근하려면 미리 써놓은 getter이용해야함!
		return tmp;}//String을 return하는 방법은 String 변수 tmp에 저장해놓고 리턴하는 거구나!!
}
