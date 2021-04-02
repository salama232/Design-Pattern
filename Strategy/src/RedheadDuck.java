
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	void display() {
		System.out.println("display from RedheadDuck");

	}
}
