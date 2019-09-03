package net.distortsm.api.entity;

import java.util.ArrayList;
import net.distortsm.api.entity.EntityType;
import net.distortsm.api.systems.shields.ShieldGroup;

public class Asteroid extends Entity {

	private static EntityType entityType = EntityType.ASTEROID;
	
	private static ArrayList<ShieldGroup> shieldGroups = null;
}
