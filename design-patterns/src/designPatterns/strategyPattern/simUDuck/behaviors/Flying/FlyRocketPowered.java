package designPatterns.strategyPattern.simUDuck.behaviors.Flying;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying with a rocket!");
	}

}
