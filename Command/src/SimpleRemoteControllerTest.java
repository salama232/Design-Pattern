import java.rmi.Remote;

import javax.sound.midi.ControllerEventListener;

public class SimpleRemoteControllerTest {

	public static void main (String[] args)
	{
		
		SimpleRemoteControl  control=new SimpleRemoteControl();
		Light livingroom=new Light("living Room");
		Light kitchenroom=new Light("kitchen Room");
        Stereo stereo=new Stereo("Living Room");
        CeilingFan Fan=new CeilingFan("Living Room");
        
        
        LightOnCommand  lightOnCommandliving=new LightOnCommand(livingroom);
        LightOnCommand  lightOnCommandkitchin=new LightOnCommand(kitchenroom);
        StereoOnwithCDcommand cDoncommand=new StereoOnwithCDcommand(stereo);
        StereoOffwithCDcommand cDoffcommand=new StereoOffwithCDcommand(stereo);
        LightOffCommand  lightOffCommandliving=new LightOffCommand(livingroom);
        LightOffCommand  lightOffCommandkitchin=new LightOffCommand(kitchenroom);
        CeilingFanHighCommand  ceilingFanHighCommand=new CeilingFanHighCommand(Fan);
        CeilingFanMeduimCommand  ceilingFanMeduimCommand=new CeilingFanMeduimCommand(Fan);
        CeilingFanLowCommand  ceilingFanlowCommand=new CeilingFanLowCommand(Fan);

        control.setCommand(0, lightOnCommandkitchin, lightOffCommandkitchin);
        control.setCommand(1, lightOnCommandliving, lightOffCommandliving);
       
        control.setCommand(2, cDoncommand, cDoffcommand);
        control.setCommand(3, ceilingFanHighCommand, ceilingFanlowCommand);
        System.out.print(control.toString());
        
        control.onButtonPushed(0);
        control.onButtonPushed(1);
        control.onButtonPushed(2);
        control.onButtonPushed(3);
        
        control.offButtonPushed(0);
        control.offButtonPushed(1);
        control.offButtonPushed(2);
        control.offButtonPushed(3);

        
        Command[] commands= {lightOnCommandliving,ceilingFanHighCommand};
        
        
        MacroCommand macroCommand=new MacroCommand(commands);
        macroCommand.execute();
       

		
		
		
	}
}
