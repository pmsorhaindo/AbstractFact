package afact;

public class CoolButton implements IButton {

	String id = null;
	int x = 0;
	int y = 0;
	int width;
	int height;
	
	public CoolButton(){
		id = "";
	}
	
	public CoolButton(String strId){
		id = strId;
	}
	
	public CoolButton(String strId, int x, int y, int width, int height){
		id = strId;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void paint() {
		System.out.println("SPLAT!");

	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String getId() {
		return id;
	}

}
