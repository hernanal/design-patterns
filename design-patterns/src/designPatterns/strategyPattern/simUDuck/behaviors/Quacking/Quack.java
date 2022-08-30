package designPatterns.strategyPattern.simUDuck.behaviors.Quacking;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
