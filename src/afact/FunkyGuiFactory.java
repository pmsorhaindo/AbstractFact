package afact;

public class FunkyGuiFactory implements IGuiFactory {

	@Override
	public IButton createButton() {
		
		IButton button = new FunkyButton();

		return button;
	}

}
