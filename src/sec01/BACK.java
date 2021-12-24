package sec01;

public class BACK {

	public static void main(String[] args) {
		Cat test = new Cat("나비",1);
		//클래스 선언 및 사용
		//new ->클래스 및 참조 타입생성 사용
		//cat -> name, age 필드가 존재 , Cry기능
		//매개변수가 2개인 생성자로 필드값을 저장
		System.out.println(test.name+"/"+test.age);
		//클래스 -> 메서드 호출
		test.Cry();
		/*
		String testname ="나비";
		int testage = 0;
		
		String testname2 ="비";
		int testage2 = 1;
		
		원래는 이런식으로 가야할 코드를 많이줄여준다.
		*/
		
	}
	
	
	
	
	
	
	/*static void chap4() {
		//지난주 정리
				//조건문
				//if(조건식)  -> 참이면 {} 실행 거짓 -> 실행x
				//비교연산자
				// == 같다, !=같지않다, < 작다, >크다, <=작거나 같다, >=크거나 같다.
				//참일때 true, 거짓 false
				if(true) {
					System.out.println("true일때 실행");
				}
				//switch(변수)
				//case 값:  	변수가 어떤 값일때 실행
				//****break;를 꼭 실행해야 다음 case가 실행이 안됨 = 참일때 멈춰
				//특징: default -> 나머지 or 기본값
				int num = 5;
				switch(num) {
				case 5 : System.out.println("5입니다"); break;
				case 4 : System.out.println("4입니다"); break;
				default :
					System.out.println("나머지입니다");
				}
				
				//반복문
				//for, while, do while
				//for(초기값; 조건식; 증감식)
				//처음엔 초기값 -> 조건식 i<5 체크 -> 참이면 -> 증감식 i 증가또는 감소
				//->조건식 i<5 체크 -> 거짓 -> 반복이 끝
				for(int i =0; i<5; i++) {
					//반복내용
					
				}
				
				//while(조건식)
				//일반적으로 while 위에 조건식에서 사용되는 변수 선언이
				//반복내용안에 변수의 값이 증가or감소하는 증감식
				int num2 = 0;
				while(num2<5) {
					System.out.println("whiletest");
					num2++;
				}
				
				//do while
				int num3 = 0;
				do { //do while은 어쨋건 한번은 돈다
					//반복내용
					//증감식
					System.out.println("do while");
					num3++; //증가하다가
				}while(num3<5); //5되면 끝
	}
}*/
}
//접근 제한자(접근지정자)
	//private - 비공개(클래스 내부에서만 사용가능)
	//public - 공개 (아무데서나 사용 가능)
	//protected - 패키지 안에서 상속관계에 있는 클래스에서 사용가능
	//default - 패키지 안에서 사용 가능
	
	//클래스
	//자바에서 소스파일 이름과 같은(대소문자도 구별) public클래스는 하나만 존재 
	class Cat{
		//필드(속성) - 정적인 값 ex)이름 , 나이 , 색깔 , 학점
		//생성자 - 클래스이름(){} ->기본생성자
		//매개변수가 있는 생성자 클래스이름(타입 변수이름)(매개변수받음)->
		//어떠한 값을 받아서 필드의 값을 저장해주는 기능
		//this. : 필드이름이랑 매개변수 이름이랑 같을때 (컴퓨터가)헷갈리지 않기 위해서 사용
		// 클래스를 의미	-> this.name -> 클래스안의 필드 name
		//메서드 - 기능 ex) 달리다, 재생하다, 공격하다, 채널을 내리다 등등
		//어떠한 행동, 기능들을 의미했다
		//void Run() {
		//		호출이 되면 실행될 기능이 들어있음
		//}
		
		
		//선언
		String name; 
		int age;
		
		//반환
		Cat(String name, int age) {//없으면 기본생성되지만 매개변수 입력하면 ㄱㅊ
			this.name = name;
			this.age = age;
		}//어떠한 생성자를가지고
		
		void Cry() {
			System.out.println("야옹야");
		}
	}
		// 어떠한 레시피를 만듬
		//어떠한 고양이란 구조를 가진 제작법같은것이다
		//클래스이름은 같은 패키지 안에서 하나만 존재,선언 가능하다.
		
