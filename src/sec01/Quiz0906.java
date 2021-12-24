package sec01;



public class Quiz0906 {

	public static void main(String[] args) {
		
		 lg_Tv Tv = new lg_Tv(10,10,"LGTV");
		// for(int i = 0; i<20;i++)//볼륨이 10이니까 작게할거면
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
			System.out.println("볼륨사이즈up: " + vol);
		} else if (vol >= 100) {
			System.out.println("최대볼륨 입니다.");
		}

	}

	void voldown() {
		vol--;
		if (vol >= 0) {
			System.out.println("볼륨사이즈down: " + vol);
		} else if (vol<=0) {
			System.out.println("최소볼륨 입니다.");
		}
	}
	void chup() {
		ch++;
		if (ch >= 0) {
			System.out.println("채널up : "+ ch);
		}
	}
	void chdown() {
		ch--;
		if (ch >= 1) {
			System.out.println("채널down :"+ ch);
		}
	}

void print() {
	System.out.println("Tv모델명: "+model+",채널은 :"+ch+"볼륨은 :"+vol);
	
}
}