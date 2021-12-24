package sec01;

public class Quiz0906ex {

	public static void main(String[] args) {
		 lg_Tv Tv = new lg_Tv(10,10,"LGTV");
			// for(int i = 0; i<20;i++)//볼륨이 10이니까 작게할거면
			 Tv.voldown();
			 Tv.chdown();
		
		
		
		Tv.volup();
		Tv.volup();
		Tv.volup();
		Tv.chup();
		Tv.chup();
		Tv.chup();
		Tv.print();

		
	}

}
class TV{
	int vol;
	int ch;
	String model;
	
	TV(int vol,int ch,String model){
		this.vol = vol;
		this.ch = ch;
		this.model = model;
	}
	//volup  소리++    잘되는지 볼륨사이즈 출력 (조건: 100이상이면 최대 볼륨입니다. vol -->100
	void volup() {
		if(vol>=100) {
			System.out.println("최대볼륨입니다."); //최대면 볼륨추가안함
			vol = 100; //최대설정
		}else {
			vol++; //100이하면 추가
		}
		System.out.println("볼륨크기는 "+vol);
	}
	//voldown 소리--			볼륨사이즈 출력 (조건: 0이하면 이미 최소 볼륨입니다 -> vol-->0 0에서 더안내려간단뜻)
	void voldown() {
		if(vol<0) {
			System.out.println("최소볼륨입니다.");
			vol=0;
		}else {
			vol--;
		}
		System.out.println("볼륨크기는 "+vol);
	}
	//chup 채널++				채널 출력
	void chup() {
		ch++;
		System.out.println("채널은"+ch);
	}
	//chdown 채널--			채널 출력
	void chdown() {
		ch--;
		System.out.println("채널은"+ch);
	}
	//print    -> 
	void print() {
		System.out.println("볼륨은"+vol+"/채널은"+ch+"모델명은:"+model);
	}

}
