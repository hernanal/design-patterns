package designPatterns.strategyPattern.simUDuck;

import designPatterns.strategyPattern.simUDuck.behaviors.Flying.FlyRocketPowered;
import designPatterns.strategyPattern.simUDuck.ducks.Duck;
import designPatterns.strategyPattern.simUDuck.ducks.MallardDuck;
import designPatterns.strategyPattern.simUDuck.ducks.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
//		Duck mallard = new MallardDuck();
//		mallard.performFly();
//		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
