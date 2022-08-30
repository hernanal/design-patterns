package designPatterns.strategyPattern.simUDuck.ducks;

import designPatterns.strategyPattern.simUDuck.behaviors.Flying.FlyNoWay;
import designPatterns.strategyPattern.simUDuck.behaviors.Quacking.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super();
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck!");
	}

}
