
public class Light  {
	String classname;
	public Light(String classname)
	{       
			this.classname=classname;	
	}
	public void on ()
	{
		System.out.println("light on ");
	}
	public void off ()
	{
		System.out.println("light off ");
	}
	public void dim ()
	{
		System.out.println("light dim ");
	}
	@Override
	public String toString() {
		return  classname;
	}
  
	
}
