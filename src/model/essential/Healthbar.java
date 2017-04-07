package model.essential;

import javafx.scene.paint.Color;

public class Healthbar {
	
	private int leben;
	private Color lebensbalken;
	
	public Healthbar() {
		// TODO Auto-generated constructor stub
		setLeben(100);
		lebensbalken.rgb(69,139,0);
	}

	public Healthbar(int leben, Color lebensbalken) {
		super();
		setLeben(leben);
		setLebensbalken(lebensbalken);
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public Color getLebensbalken() {
		return lebensbalken;
	}

	public void setLebensbalken(Color lebensbalken) {
		this.lebensbalken = lebensbalken;
	}
	

}
