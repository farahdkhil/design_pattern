package Creator;


import Products.AbstractProductA;
import Products.AbstractProductB;
import Products.ConcreteProductA1;
import Products.ConcreteProductB1;

public class ConcreteFactory1 extends AbstractFactory{

	@Override
	public AbstractProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB1();
	}

}
