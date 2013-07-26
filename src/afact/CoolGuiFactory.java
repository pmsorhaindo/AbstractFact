package afact;

public class CoolGuiFactory implements IGuiFactory {

	@Override
	public IButton createButton() {
		
		IButton button = new CoolButton();

		return button;
	}

}
