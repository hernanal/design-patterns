package designPatterns.factoryPattern.simpleFactory;

import designPatterns.factoryPattern.pizzas.CheesePizza;
import designPatterns.factoryPattern.pizzas.ClamPizza;
import designPatterns.factoryPattern.pizzas.PepperoniPizza;
import designPatterns.factoryPattern.pizzas.Pizza;
import designPatterns.factoryPattern.pizzas.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
