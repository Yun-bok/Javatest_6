package sec01;

public class Quiz0903 {

	public static void main(String[] args) {
		//Song song = new Song("돌핀","???"
		Song song = new Song("돌핀","???",0,4);
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
//메서드
//play ---->"라라라라" 츨력하고 재생횟수를 +1 그리고 출력
	void Play( ) {
		System.out.println("라라라라");
		Play_Count++;
		System.out.println("Play_Count");
	}
	
	void Rankup() {
		Rank++;
		//System.out.print
		if(Rank>=1 && Rank<=3) {
			System.out.println("잘하셨습니다.");
		}
	}
	void Rankdown() {
		Rank++;
		if(Rank>=5) {
			System.out.println("분발하세요");
		}
	}
	
	//print 함수
	void print() {
		System.out.println("노래제목: "+name+"가수: "+Singer+",재생횟수: "+Play_Count+", 랭크는: "+Rank);
	}