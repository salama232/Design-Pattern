
public class SimpleRemoteControllerTest {

	public static void main (String[] args)
	{
		
		SimpleRemoteControl  control=new SimpleRemoteControl();
		Light light=new Light();
		control.setSlot1(new LightCommand(light));
		control.ButtonPressed();
		
		
		
	}
}
