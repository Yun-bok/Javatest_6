package sec14;

public class ex01 {
	public static void main(String[] args) {

		Car myCar = new Car();
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재속도: "+myCar.getSpeed());
		
		//올바른 속도 변셩
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도:" +myCar.getSpeed());
	}
}

//267~268
class Car {
	// 필드

	private int speed;
	private boolean stop;
	private String color;
	private String car_type;
	private int price;

	// 생성지

	// 메서드
	// getter
	public int getSpeed() {
		return speed;
	}

	// setter
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	// getter
	public boolean isStop() {
		return stop;
	}

	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}//setter와 getter 그리고 어노테이션 숙지