package interfaces_exploration;

public class Main {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Rabbit rabbit = new Rabbit();
		Fish fish = new Fish();
		
		lion.hunt();
		rabbit.flee();
		fish.hunt();
		fish.flee();
		
	}
}
