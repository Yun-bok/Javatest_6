package sec01;

public class Calculator {
	// 리턴타입 -> 반환 타입 -> 함수가 끝났을때 나오는 결과값
	double areaTectangle(double width) {
		return width * width;
	}
	
	int areaTectangle(int width) {
		return width * width;
	}
	//메서드 오버로딩 
	//ㄴ> 매개변수의 타입이 다르거나 갯수가 다를때 같은이름의 메서드를 만들수있다.
	double areaTectangle(double width, double height) {
		return width * height;
	}
}
