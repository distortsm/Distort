package net.distortsm.api.systems;

import java.util.List;
import java.util.Set;
import java.lang.reflect.Method; 
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import org.schema.game.common.controller.elements.power.reactor.MainReactorUnit;
import org.schema.game.common.controller.elements.power.reactor.PowerConsumer;
import org.schema.game.common.controller.elements.power.reactor.PowerInterface;
import org.schema.game.common.controller.elements.power.reactor.StabilizerCollectionManager;
import org.schema.game.common.controller.elements.power.reactor.chamber.ConduitCollectionManager;
import org.schema.game.common.controller.elements.power.reactor.chamber.ReactorChamberUnit;
import org.schema.game.common.controller.elements.power.reactor.tree.ReactorSet;
import org.schema.game.common.controller.elements.power.reactor.tree.ReactorTree;

public interface Reactor extends PowerInterface {
		
	
	//Object Reflectors
	private static Object getRechargeRatePowerPerSecObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getRechargeRatePowerPerSec");
		method.setAccessible(true); 
		return method.invoke(getRechargeRatePowerPerSecObject()); 
	}
	
	private static Object getRechargeRatePercentPerSecObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getRechargeRatePercentPerSec");
		method.setAccessible(true); 
		return method.invoke(getRechargeRatePercentPerSecObject()); 
	}
	
	private static Object getPowerObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getPower");
		method.setAccessible(true); 
		return method.invoke(getPowerObject()); 
	}
	
	private static Object getMaxPowerObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getMaxPower");
		method.setAccessible(true); 
		return method.invoke(getMaxPowerObject()); 
	}
	
	private static Object getChambersObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getChambers");
		method.setAccessible(true); 
		return method.invoke(getChambersObject()); 
	}
	
	private static Object getReactorChamberObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactorChamber", ReactorChamberUnit.class);
		method.setAccessible(true); 
		return method.invoke(getReactorChamberObject()); 
	}
	
	private static Object getConduitsObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getConduits");
		method.setAccessible(true); 
		return method.invoke(getConduitsObject()); 
	}
	
	private static Object getConnectedChambersToConduitObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getConnectedChambersToConduit");
		method.setAccessible(true); 
		return method.invoke(getConnectedChambersToConduitObject()); 
	}
	
	private static Object getReactorSetObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactorSet");
		method.setAccessible(true); 
		return method.invoke(getReactorSetObject()); 
	}
	
	private static Object getReactorOptimalDistanceObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactorOptimalDistance");
		method.setAccessible(true); 
		return method.invoke(getReactorOptimalDistanceObject()); 
	}
	
	private static Object getStabilizerCollectionManagerObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getStabilizerCollectionManager");
		method.setAccessible(true); 
		return method.invoke(getStabilizerCollectionManagerObject()); 
	}
	
	private static Object addConsumerObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("addConsumer", PowerConsumer.class);
		method.setAccessible(true); 
		return method.invoke(addConsumerObject()); 
	}
	
	private static Object removeConsumerObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("removeConsumer", PowerConsumer.class);
		method.setAccessible(true); 
		return method.invoke(removeConsumerObject()); 
	}
	
	private static Object getCurrentConsumptionObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getCurrentConsumption");
		method.setAccessible(true); 
		return method.invoke(getCurrentConsumptionObject()); 
	}
	
	private static Object getCurrentConsumptionPerSecObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getCurrentConsumptionPerSec");
		method.setAccessible(true); 
		return method.invoke(getCurrentConsumptionPerSecObject()); 
	}
	
	private static Object isActiveReactorObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("isActiveReactor", ReactorTree.class);
		method.setAccessible(true); 
		return method.invoke(isActiveReactorObject()); 
	}
	
	private static Object getReactorSwitchCooldownObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactorSwitchCooldown");
		method.setAccessible(true); 
		return method.invoke(getReactorSwitchCooldownObject()); 
	}
	
	private static Object getReactorSwitchCooldownObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactorSwitchCooldown");
		method.setAccessible(true); 
		return method.invoke(getReactorSwitchCooldownObject()); 
	}
	
	//Getters
	public static double getPowerRechargeRate() throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return Double.parseDouble(getRechargeRatePowerPerSecObject().toString());
	}
}
