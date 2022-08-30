package designPatterns.decoratorPattern.starbuzzCoffee.condiments;

import designPatterns.decoratorPattern.decorator.CondimentDecorator;
import designPatterns.decoratorPattern.supertype.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
