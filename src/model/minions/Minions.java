package model.minions;

import model.essential.Healthbar;

public class Minions {

	private Healthbar health;
	private int damage;
	
	/**
	 * 
	 * @param health
	 * @param damage
	 * @param movementspeed
	 */
	public Minions(Healthbar health, int damage) {
		super();
		setHealth(health);
		setDamage(damage);
	}

	/**
	 * @return the health
	 */
	public Healthbar getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(Healthbar health) {
		this.health = health;
	}

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	
}
