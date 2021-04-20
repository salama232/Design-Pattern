
public class Milk extends CondimentDecorator {
    Beverage beverage;
    
    public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
    	
    	this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Milk";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.10;
	}
	

}
