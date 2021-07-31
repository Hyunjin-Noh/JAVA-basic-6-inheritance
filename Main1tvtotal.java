public class Main1tvtotal{
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
class TV{
	   private int size;
	   public TV(int size) {this.size = size;}//TV클래스의 생성자. size를 매개변수로 가짐.
	   protected int getSize() {return size;}//TV클래스의, size 변수 리턴하는 메소드
	}

class ColorTV extends TV {
   private int resolution;
   ColorTV(int size, int resolution) {
      super(size);//첫 줄에 와야 함. 인자를 이용하여 슈퍼클래스의 해당하는 적당한 생성자 호출.
      this.resolution = resolution;
   }//ColorTV클래스의 생성자. size와 resolution을 매개변수로 가짐.
   public void printProperty() {
      System.out.print(getSize()+"인치 "+resolution+"컬러");
   }//ColorTV클래스의, 사이즈와 해상도를 출력하는 메소드.
}

class IPTV extends ColorTV {
	   private String IP;
	   IPTV(String IP, int size, int resolution) {
	      super(size, resolution);//첫 줄에 와야 함. 인자를 이용하여 슈퍼클래스의 해당하는 적당한 생성자 호출.
	      this.IP = IP;
	   }//IPTV클래스의 생성자. size, resolution, 그리고 IP를 매개변수로 가짐.
	   public void printProperty() {
	      System.out.print("나의 IPTV는 "+IP+" 주소의 ");
	      super.printProperty();
	   }//IPTV클래스의, IP주소를 출력하는 메소드.
	}
