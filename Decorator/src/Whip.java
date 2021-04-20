
public class Whip extends CondimentDecorator {
    Beverage beverage;
    
    public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
    	
    	this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whip";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.10;
	}
	
}
