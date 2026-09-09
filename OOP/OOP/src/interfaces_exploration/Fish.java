package interfaces_exploration;

public class Fish implements Prey, Predator{

	@Override
	public void flee() {
		System.out.println("The fish is swimming away from bigger fish!");
		
	}
	
	@Override
	public void hunt() {
		System.out.println("The fish is hunting for smaller fish!");
		
	}
}
