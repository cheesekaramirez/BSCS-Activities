package abstract_exploration;

public abstract class Vehicle {
	private int speed;
	void setSpeed(int speed) {
		this.speed = speed;
	}
	int getSpeed() {
		return speed;
	}
	void go() {
		System.out.println("Vroom!");
	}
	
	void stop() {
		System.out.println("Skrrrt!");
	}
	
	abstract void speedUp();
	
	void warning() {
		System.out.println("Are you trying to die?! Slow down!");
	};
}
