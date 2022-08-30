package designPatterns.strategyPattern.simUDuck.behaviors.Flying;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I cannot fly!!!");
	}

}
