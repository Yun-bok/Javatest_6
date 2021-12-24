package sec01;

import java.util.Scanner;

public class Quiz2_0906ex {

	public static void main(String[] args) {
		Game game = null; //null 아무것도 없다 비어있는 ->참조하는 주소값이 없을때
		while(true) {
			System.out.println("1. 게임클래스 생성, 2. 조회,3.난이도 조절 4. 점수조절,5. 종료");
			Scanner input = new Scanner(System.in);
			
			int num = Integer.parseInt(input.nextLine());
			
			if(num==1 ) {
				String game_name = input.nextLine();
				int game_lev = Integer.parseInt(input.nextLine());
				int game_score = Integer.parseInt(input.nextLine());
				game = new Game(game_name,game_lev,game_score);
			}else if(num==2) {
				game.print();
			}else if(num==3) {
				System.out.println("1. 난이도업,2. 난이도다운");
				int num2 = Integer.parseInt(input.nextLine());
				if(num2==1) {
					game.lev_up();//1입력하면 난이도 업
				}else if(num2==2) {
					game.lev_down();
				}
			}else if(num==4) {
				System.out.println("1. 점수증가, 2. 점수 감소");
				int num2 = Integer.parseInt(input.nextLine());
				if(num2==1) {
					game.score_up();
				}else if(num2==2) {
					game.score_down();
				}
			}else if(num==5) {
				System.out.println("종료");
				break;
			}
		}
		

	}
	

//Game을 지칭하는 클래스 생성
//필드 - type 게임종류, lev 레벨(난이도), score 점수 필드셋
//생성자 -> 게임종류,레벨, score


//메서드 -> lev_up()난이도업, lev_down() 난이도 다운, score_up 점수획득, score_down 점수감소
//print ->게임데이터 출력
//lev_up -> lev++ 1증가  lev 출력
//lev_down -> lev-- 1감소 lev 출력
//score_up -> 2점증가, score출력
//score_down ->2점감소, score출력
//print -> lev 1-> score 90점이상승리
//		-> lev 2-> score 80점이상승리
//		-> lev 3-> score 70점이상승리
}

