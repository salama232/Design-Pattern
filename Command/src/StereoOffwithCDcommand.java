
public class StereoOffwithCDcommand implements Command{

	Stereo stereo;
	
	 public StereoOffwithCDcommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}
	
	

}
