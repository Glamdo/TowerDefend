package model.minions;
import model.essential.Healthbar;

public class Gegner extends Minions {
	private int speed;
	private int anzahl;
	private static int zaehler = 1;
	public Gegner(Healthbar health, int damage, int speed) {
		super(health, damage);
		// TODO Auto-generated constructor stub
		setSpeed(speed);
		anzahl =5;
	}
	public int anzahlBerechnen(){
		anzahl = anzahl *zaehler;
		zaehler++;
		return anzahl;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
