
public class SimpleRemoteControl {

    Command slot1;
    
    
    public SimpleRemoteControl()
    {
    	
    }


	public Command getSlot1() {
		return slot1;
	}


	public void setSlot1(Command slot1) {
		this.slot1 = slot1;
	}
    
	public void ButtonPressed()
	{
		slot1.execute();
	}
   
    
}
