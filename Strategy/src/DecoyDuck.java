
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	void display() {
		System.out.println("display from DecoyDuck");
	}
}
