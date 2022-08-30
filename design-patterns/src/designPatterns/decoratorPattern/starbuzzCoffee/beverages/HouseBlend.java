package designPatterns.decoratorPattern.starbuzzCoffee.beverages;

import designPatterns.decoratorPattern.supertype.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
