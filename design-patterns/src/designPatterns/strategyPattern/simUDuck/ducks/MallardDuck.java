package designPatterns.strategyPattern.simUDuck.ducks;

import designPatterns.strategyPattern.simUDuck.behaviors.Flying.FlyWithWings;
import designPatterns.strategyPattern.simUDuck.behaviors.Quacking.Quack;

public class MallardDuck extends Duck {
	
	

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard duck");
	}

}
