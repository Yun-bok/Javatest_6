package sec01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//
		double result1 = cal.areaTectangle(10.5);
		int result2 = cal.areaTectangle(10);
		double result3 = cal.areaTectangle(3.5,4.3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
