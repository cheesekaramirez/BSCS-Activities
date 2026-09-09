package abstract_exploration;

public class Car extends Vehicle{
	private int maxSpeed = 155;
	@Override
	void speedUp() {
		setSpeed(getSpeed()+20);
		
		if(getSpeed() >= maxSpeed) {
			setSpeed(maxSpeed);
		} 
		
		System.out.printf("%nThe speed is %d kph.%n",getSpeed());
		
		if(getSpeed()>=120) {
			warning();
		}
		
	}
}
