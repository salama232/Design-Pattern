
public class Soy extends CondimentDecorator {
    Beverage beverage;
    
    public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
    	
    	this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", soy";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.15;
	}
}

