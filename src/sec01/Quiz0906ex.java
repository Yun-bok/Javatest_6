package sec01;

public class Quiz0906ex {

	public static void main(String[] args) {
		 lg_Tv Tv = new lg_Tv(10,10,"LGTV");
			// for(int i = 0; i<20;i++)//������ 10�̴ϱ� �۰��ҰŸ�
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
	//volup  �Ҹ�++    �ߵǴ��� ���������� ��� (����: 100�̻��̸� �ִ� �����Դϴ�. vol -->100
	void volup() {
		if(vol>=100) {
			System.out.println("�ִ뺼���Դϴ�."); //�ִ�� �����߰�����
			vol = 100; //�ִ뼳��
		}else {
			vol++; //100���ϸ� �߰�
		}
		System.out.println("����ũ��� "+vol);
	}
	//voldown �Ҹ�--			���������� ��� (����: 0���ϸ� �̹� �ּ� �����Դϴ� -> vol-->0 0���� ���ȳ������ܶ�)
	void voldown() {
		if(vol<0) {
			System.out.println("�ּҺ����Դϴ�.");
			vol=0;
		}else {
			vol--;
		}
		System.out.println("����ũ��� "+vol);
	}
	//chup ä��++				ä�� ���
	void chup() {
		ch++;
		System.out.println("ä����"+ch);
	}
	//chdown ä��--			ä�� ���
	void chdown() {
		ch--;
		System.out.println("ä����"+ch);
	}
	//print    -> 
	void print() {
		System.out.println("������"+vol+"/ä����"+ch+"�𵨸���:"+model);
	}

}
