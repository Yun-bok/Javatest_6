package sec14;

import java.util.Scanner;

public class Quiz {
//q1
//1~'입력'받은 정수까지 3의 배수와 5의 배수를 제외한수들을 출력하고 출력한수들의 갯수를 출력하시오.
//q2
//구구단을 9단부터 1단까지 출력하시오.
//q3
//정수를 입력받아 다음과 같이 행열을 출력하세요
//1 2 3 4
//2 4 6 8
//3 6 9 12
//4 8 12 16
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//q1();
		q3();
	}
	static void q1() {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());//받고
		int cnt = 0;
		//3과 5의 배수를 '제외'한 수 출력 출력한 수들의 갯수
		//나눳을때 나머지가 0이면?
		for(int i =0; i<=num; i++) { //1~입력받은거까지 
			if(i%3!=0 && i%5!=0) {
				cnt++;
				
				System.out.println(i);
			}
		}
		System.out.println(cnt);
		
		
		
	}
	
static void q2() {
	for(int j=9;j>1;j--) { //9부터 9876 순으로 반복
		for(int i=9;i>1;i--) {
			System.out.println(i+"단");
			for(int j =1; j<=9; j++) {
				System.out.println(i+"단"+j"단"+i*j);
			}
		}
	}
	
}
static void q3() {
	Scanner input = new Scanner(System.in);
	int num = Integer.parseInt(input.nextLine());
	//행
	for(int i=1; i<=num; i++) {
		//열
		for(int j = 1; j<=num; j++) {
			System.out.print(i*j+" ");
		}
		System.out.println();
	}
		
		
	
			
		}
	
}

