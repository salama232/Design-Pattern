
public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	void display() {
		System.out.println("display from RubberDuck");
	}
}
