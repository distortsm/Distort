package net.distortsm.api.entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import net.distortsm.api.player.Faction;
import net.distortsm.api.systems.reactor.Reactor;
import net.distortsm.api.systems.shields.ShieldGroup;

public class Ship extends Entity {

	private EntityType entityType = EntityType.SHIP;
	private double thrustMassRatio;
	private double thrusterCount;
	private double turningSpeed;
	private Faction faction;
	private List<ShieldGroup> shieldgroups;
	private List<Ship> turrets;
	private List<Ship> docks;
	private List<Reactor> reactors;
	private Reactor currentReactor;
	
	//Object Reflectors
	private Object getCurrentReactorObject(long var1) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = Ship.class.getDeclaredMethod("getReactor", long.class);
		method.setAccessible(true); 
		return method.invoke(getReactorObject(var1)); 
	}
}
