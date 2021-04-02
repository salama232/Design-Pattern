
public class Test {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	    Duck modelduck=new ModelDuck();
	    modelduck.performFly();
	    modelduck.setFlyBehavior(new FlyRocketPowered());
	    modelduck.performFly();
	}

}
