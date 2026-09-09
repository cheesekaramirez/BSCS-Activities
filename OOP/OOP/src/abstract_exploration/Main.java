package abstract_exploration;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.go();
		for (int i=0;i<10;i++) {
			car.speedUp();
		}
	}

}
