public class Main3colorblackandred {
  public static void main(String[] args) {
    ColorPoint zeroPoint = new ColorPoint(); //(0,0)是帖税 BLACK事 繊.
    System.out.println(zeroPoint.toString() + "脊艦陥.");
    
    ColorPoint cp = new ColorPoint(10, 10);//(10, 10)是帖税 BLACK事 繊.
    
    cp.setXY(5, 5);
    cp.setColor("RED");
    System.out.println(cp.toString() + "脊艦陥.");//RED事税 (5,5)税 繊脊艦陥.
  }
}
class Point {
  private int x, y;
  public Point(int x, int y) { this.x = x; this.y = y; }//Point適掘什税 持失切. x, y研 古鯵痕呪稽 亜像.
  
  public int getX() { return x; }
  public int getY() { return y; }
  //Point適掘什税 呉獄 五社球. 唖唖 private 呉獄 琶球 x, y葵聖 鋼発敗.
  
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
	//岨 働紺廃 持失切 却ぞぞ....
	public void setColor(String color) {this.color = color;}
	//ColorPoint適掘什税 呉獄 五社球. private 呉獄 琶球 color葵聖 鋼発敗.
	
	public void setXY(int x, int y) {move(x, y);}//焼猿 益 働紺廃 持失切稽 BLACK(10,10)拭 背雁獣佃兜壱 薪奄形壱 move彰 暗姥蟹ぞぞぞぞ....腰暗罫惟ぞぞ
	public String toString() {
		String tmp = color+"事税 "+"("+getX()+","+getY()+")"+"税 繊";//伽 輯遁適掘什税 private痕呪拭 羨悦馬形檎 耕軒 潤兜精 getter戚遂背醤敗!
		return tmp;}//String聖 return馬澗 号狛精 String 痕呪 tmp拭 煽舌背兜壱 軒渡馬澗 暗姥蟹!!
}
