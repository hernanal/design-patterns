package designPatterns.strategyPattern.simUDuck.behaviors.Quacking;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
