package Creator;


import Products.AbstractProductA;
import Products.AbstractProductB;
import Products.ConcreteProductA2;
import Products.ConcreteProductB2;

public class ConcreteFactory2 extends AbstractFactory{

	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB2();
	}

}
