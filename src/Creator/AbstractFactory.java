package Creator;

import Products.AbstractProductA;
import Products.AbstractProductB;

public abstract class AbstractFactory {
	public abstract AbstractProductA  CreateProductA();
	public abstract AbstractProductB  CreateProductB();
}
