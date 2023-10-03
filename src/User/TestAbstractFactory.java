package User;

import Creator.AbstractFactory;
import Creator.ConcreteFactory1;
import Creator.ConcreteFactory2;

public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory0=new ConcreteFactory1();
		factory0.CreateProductA();
		AbstractFactory factory1=new ConcreteFactory1();
		factory1.CreateProductB();
		AbstractFactory factory2=new ConcreteFactory2();
		factory2.CreateProductA();
		AbstractFactory factory3=new ConcreteFactory2();
		factory3.CreateProductB();	
	}

}
