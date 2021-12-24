package sec07;

public class ex01_01 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = Cal.plus(3, 4);
		Cal.plus(3,4); //정수로 3+4
		Cal.mul(3,4);
		
		Cal cal_val = new Cal();
		cal_val.minus(5,3);
		cal_val.div(5,3);

	}

}
////Cal 클래스
//덧셈, 뺄셈, 곱셈, 나눗셈
//위에 main의 에러가 사라지게 클래스 안에 메소드 작성
class Cal{
	static int plus(int a, int b) {
		return a+b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	int minus(int a, int b) {
		return a-b;
	}
	double div(int a, int b) {
		return a/b;
	}
	//스태틱차이였다고 한다
	
}
