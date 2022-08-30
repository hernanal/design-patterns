package designPatterns.decoratorPattern.starbuzzCoffee.condiments;

import designPatterns.decoratorPattern.decorator.CondimentDecorator;
import designPatterns.decoratorPattern.supertype.Beverage;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
