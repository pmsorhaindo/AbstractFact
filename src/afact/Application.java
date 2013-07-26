package afact;

public class Application {
	
	IGuiFactory guiFactory = null;
	
	public Application(IGuiFactory guiFactory){
		
		this.guiFactory = guiFactory;
	}
	
	public void run(){
		
		IButton button = guiFactory.createButton();
		
		button.paint();
	}

}
