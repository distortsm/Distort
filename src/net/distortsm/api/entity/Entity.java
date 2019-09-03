package net.distortsm.api.entity;

import java.util.ArrayList;
import net.distortsm.api.systems.shields.ShieldCapacity;
import net.distortsm.api.systems.shields.ShieldGroup;

public class Entity {

	private static String entityName;
	private static EntityType entityType;
	private static String entityID;
	private static ArrayList<ShieldGroup> shieldGroups = new ArrayList<ShieldGroup>();
	
	public static String getName() {
		return entityName;
	}
	
	public static EntityType getEntityType() {
		return entityType;
	}
	
	public static String getEntityID() {
		return entityID;
	}
	
	public static double getShieldCapacity(ShieldGroup shieldGroup) {
		double shieldCapacity = shieldGroup.getCapacity();
		
		return shieldCapacity;
	}
}