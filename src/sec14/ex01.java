package sec14;

public class ex01 {
	public static void main(String[] args) {

		Car myCar = new Car();
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("����ӵ�: "+myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�:" +myCar.getSpeed());
	}
}

//267~268
class Car {
	// �ʵ�

	private int speed;
	private boolean stop;
	private String color;
	private String car_type;
	private int price;

	// ������

	// �޼���
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
}//setter�� getter �׸��� ������̼� ����