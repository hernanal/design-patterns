package designPatterns.decoratorPattern.decorator;

import designPatterns.decoratorPattern.supertype.Beverage;

public abstract class CondimentDecorator extends Beverage {

	protected Beverage beverage;
	
	public abstract String getDescription();
}
