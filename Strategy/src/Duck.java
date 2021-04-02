public abstract class Duck {

	

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


	void swim() {
		System.out.println("swim from duck");

	}

	void display() {
		System.out.println("display from duck");

	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

}
