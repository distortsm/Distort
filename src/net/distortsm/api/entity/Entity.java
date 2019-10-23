package net.distortsm.api.entity;

import net.distortsm.api.player.Faction;

public class Entity {

	private String entityName;
	private EntityType entityType;
	private String entityID;
	private double currentSpeed;

	public Entity(String name, EntityType eType, String ID) {
		entityName = name;
		entityType = eType;
		entityID = ID;
	}
}