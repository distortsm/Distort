package net.distortsm.api.systems.shields;

public class ShieldGroup {

	private double shieldCapacity;
	private double shieldRegen;
	private double shieldRadius;
	
	public double getCapacity() {
		return shieldCapacity;
	}
	
	public double getRegen() {
		return shieldRegen;
	}
	
	public double getRadius() {
		return shieldRadius;
	}
	
	public void setCapacity(double capacity) {
		shieldCapacity = capacity;
	}
	
	public void setRegen(double regen) {
		shieldRegen = regen;
	}
	
	public void setRadius(double radius) {
		shieldRadius = radius;
	}

}
