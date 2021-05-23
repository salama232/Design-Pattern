
public class SimpleRemoteControl {

    Command[] OnButton;
    Command[] OffButton;
    Command undoCommand;
 

	public SimpleRemoteControl()
    {
		OnButton =new Command[7];
		OffButton =new Command[7];
		
		Command nocommand=new NoCommand();
		
		for (int i=0;i<OnButton.length;i++) {
			OnButton[i] =nocommand;
			OffButton[i] =nocommand;
    }	
		undoCommand=nocommand;
    }
	
	public void setCommand(int slot,Command onCommand,Command offCommand)
	{
		this.OnButton[slot]=onCommand;
		this.OffButton[slot]=offCommand;
		
		
		
	}
	
	public void onButtonPushed(int slot)
	{ 
		OnButton[slot].execute();
		undoCommand=OnButton[slot];
	
	}
	
	public void offButtonPushed(int slot)
	{	
		OffButton[slot].execute();
		undoCommand=OnButton[slot];
	
	}
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < OnButton.length; i++) {
			if (OffButton[i] != null)
		stringBuff.append("[slot " + i + "] " + OnButton[i].getClass().getName()
		+ " " + OffButton[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
		}
	
	public void undoButton()
	{
		undoCommand.undo();
	}
}
