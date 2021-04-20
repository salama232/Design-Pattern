
public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage beverage1=new Espresso();
		System.out.println(beverage1.getDescription()
				+ " $ " + beverage1.cost());
		beverage1=new Milk(beverage1);
		System.out.println(beverage1.getDescription()
				+ " $ " + beverage1.cost());
		
	}
	

}
