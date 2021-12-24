package sec07;

public class ex01_02 {

	public static void main(String[] args) {
		String str = Television.info;
		System.out.println(str);
		//싱글톤이란 개념은 생성한 객체는 정적메소드를 이용해서 계속반환한다
		Television test = Television.getInstance();
		Television test2 = Television.getInstance();
	}

}
// 걍이렇게 쓴다~ 이렇게 쓰는구나
class Television {
	static Television single = new Television(); //싱글톤
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	private Television() {
		
	}
	
	static Television getInstance() {
		return single;
	}
	
	static {
		info = company +"-"+model;
	}
}