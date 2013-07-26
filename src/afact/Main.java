package afact;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// changing the object created from CoolGuiFactory to FunkyGuiFactory changes the output :)
		IGuiFactory fact = new CoolGuiFactory();
		Application a = new Application(fact);
		
		a.run();

	}

}
