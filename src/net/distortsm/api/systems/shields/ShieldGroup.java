package net.distortsm.api.systems.shields;

public class ShieldGroup {

	private static double shieldCapacity;
	private static double shieldRegen;
	private static double shieldRadius;
	
	public static double getCapacity() {
		return shieldCapacity;
	}
	
	public static double getRegen() {
		return shieldRegen;
	}
	
	public static double getRadius() {
		return shieldRadius;
	}
	
	public static void setCapacity(double capacity) {
		shieldCapacity = capacity;
	}
	
	public static void setRegen(double regen) {
		shieldRegen = regen;
	}
	
	public static void setRadius(double radius) {
		shieldRadius = radius;
	}

}
