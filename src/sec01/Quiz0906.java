package sec01;



public class Quiz0906 {

	public static void main(String[] args) {
		
		 lg_Tv Tv = new lg_Tv(10,10,"LGTV");
		// for(int i = 0; i<20;i++)//������ 10�̴ϱ� �۰��ҰŸ�
		 Tv.voldown();
		 Tv.chdown();
	
	}
	/*
	Tv.volup();
	Tv.volup();
	Tv.volup();
	Tv.chup();
	Tv.chup();
	Tv.chup();
	Tv.print();
*/
}

class lg_Tv {
	public int vol;
	public int ch;
	public String model;

	lg_Tv(int Vol, int Ch, String Model) {
		this.vol = Vol;
		this.ch = Ch;
		this.model = Model;

	}

	void volup() {
		vol++;
		if (vol >= 0 ) {
			System.out.println("����������up: " + vol);
		} else if (vol >= 100) {
			System.out.println("�ִ뺼�� �Դϴ�.");
		}

	}

	void voldown() {
		vol--;
		if (vol >= 0) {
			System.out.println("����������down: " + vol);
		} else if (vol<=0) {
			System.out.println("�ּҺ��� �Դϴ�.");
		}
	}
	void chup() {
		ch++;
		if (ch >= 0) {
			System.out.println("ä��up : "+ ch);
		}
	}
	void chdown() {
		ch--;
		if (ch >= 1) {
			System.out.println("ä��down :"+ ch);
		}
	}

void print() {
	System.out.println("Tv�𵨸�: "+model+",ä���� :"+ch+"������ :"+vol);
	
}
}