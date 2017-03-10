package Minions;

/**
 * 
 * @author Miles
 *
 */
public class Minions {

	private int health;
	private int damage;
	private int movementspeed;
	
	/**
	 * 
	 * @param health
	 * @param damage
	 * @param movementspeed
	 */
	public Minions(int health, int damage, int movementspeed) {
		super();
		setHealth(health);
		setDamage(damage);
		setMovementspeed(movementspeed);
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
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

	/**
	 * @return the movementspeed
	 */
	public int getMovementspeed() {
		return movementspeed;
	}

	/**
	 * @param movementspeed the movementspeed to set
	 */
	public void setMovementspeed(int movementspeed) {
		this.movementspeed = movementspeed;
	}
	
	
}
