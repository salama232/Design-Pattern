
public class StereoOnwithCDcommand implements Command{

	Stereo stereo;
	
	 public StereoOnwithCDcommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.SetCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
		
	}
	
	

}
