package sec01;

public class Quiz0903 {

	public static void main(String[] args) {
		//Song song = new Song("����","???"
		Song song = new Song("����","???",0,4);
		song.Play();
		song.Play();
		song.Play();
		song.Rankup();
		song.Rankdown();
		song.Rankdown();
		song.Rankdown();
	}

}
class Song {
	public String name;
	public String Singer;
	public int Play_Count;
	public int Rank;
	
	Song(String name,String Singer,int Play_Count,int Rank) {
		this.name = name;
		this.Singer = Singer;
		this.Play_Count = Play_Count;
		this.Rank = Rank;
	}
	
}
//�޼���
//play ---->"�����" �����ϰ� ���Ƚ���� +1 �׸��� ���
	void Play( ) {
		System.out.println("�����");
		Play_Count++;
		System.out.println("Play_Count");
	}
	
	void Rankup() {
		Rank++;
		//System.out.print
		if(Rank>=1 && Rank<=3) {
			System.out.println("���ϼ̽��ϴ�.");
		}
	}
	void Rankdown() {
		Rank++;
		if(Rank>=5) {
			System.out.println("�й��ϼ���");
		}
	}
	
	//print �Լ�
	void print() {
		System.out.println("�뷡����: "+name+"����: "+Singer+",���Ƚ��: "+Play_Count+", ��ũ��: "+Rank);
	}