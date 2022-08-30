package designPatterns.strategyPattern.simUDuck.behaviors.Flying;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying!!!");
	}

}
