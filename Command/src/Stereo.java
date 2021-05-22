
public class Stereo {
	String classname;
	
	public Stereo(String classname)
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
	public void SetCD ()
	{
		System.out.println("CD SET");
	}
	
	public void setVolume(int volume)
	{
		System.out.println("CD volume"+volume);

	}
	
	@Override
	public String toString() {
		return  classname;
	}
	
}
