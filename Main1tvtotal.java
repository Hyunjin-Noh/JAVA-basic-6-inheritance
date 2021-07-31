public class Main1tvtotal{
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
class TV{
	   private int size;
	   public TV(int size) {this.size = size;}//TVŬ������ ������. size�� �Ű������� ����.
	   protected int getSize() {return size;}//TVŬ������, size ���� �����ϴ� �޼ҵ�
	}

class ColorTV extends TV {
   private int resolution;
   ColorTV(int size, int resolution) {
      super(size);//ù �ٿ� �;� ��. ���ڸ� �̿��Ͽ� ����Ŭ������ �ش��ϴ� ������ ������ ȣ��.
      this.resolution = resolution;
   }//ColorTVŬ������ ������. size�� resolution�� �Ű������� ����.
   public void printProperty() {
      System.out.print(getSize()+"��ġ "+resolution+"�÷�");
   }//ColorTVŬ������, ������� �ػ󵵸� ����ϴ� �޼ҵ�.
}

class IPTV extends ColorTV {
	   private String IP;
	   IPTV(String IP, int size, int resolution) {
	      super(size, resolution);//ù �ٿ� �;� ��. ���ڸ� �̿��Ͽ� ����Ŭ������ �ش��ϴ� ������ ������ ȣ��.
	      this.IP = IP;
	   }//IPTVŬ������ ������. size, resolution, �׸��� IP�� �Ű������� ����.
	   public void printProperty() {
	      System.out.print("���� IPTV�� "+IP+" �ּ��� ");
	      super.printProperty();
	   }//IPTVŬ������, IP�ּҸ� ����ϴ� �޼ҵ�.
	}
