package net.distortsm.api.systems;

import java.util.List;
import java.lang.reflect.Method; 
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor; 
import org.schema.game.common.controller.elements.power.reactor.PowerInterface;
import org.schema.game.common.data.player.PlayerState;

public class Reactor {
		
	public static double getRechargeRatePowerPerSec() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		double reactorRechargeRatePowerPerSec;
		Method getReactorRechargeRatePowerPerSecMethod = PowerInterface.class.getDeclaredMethod("getRechargeRatePowerPerSec", double.class);
		getReactorRechargeRatePowerPerSecMethod.setAccessible(true); 
		getReactorRechargeRatePowerPerSecMethod.invoke(reactorRechargeRatePowerPerSec); 
	}
	
	public static double getRechargeRatePercentPerSec() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		double reactorRechargeRatePercentPerSec;
		Method getRechargeRatePercentPerSecMethod = PowerInterface.class.getDeclaredMethod("getRechargeRatePercentPerSec", double.class);
		getRechargeRatePercentPerSecMethod.setAccessible(true); 
		getRechargeRatePercentPerSecMethod.invoke(reactorRechargeRatePercentPerSec); 
	}
	
	public static double getReactorCurrentConsumption() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		double reactorCurrentConsumption;
		Method getReactorCurrentConsumptionMethod = PowerInterface.class.getDeclaredMethod("getReactorCurrentConsumption", double.class);
		getReactorCurrentConsumptionMethod.setAccessible(true); 
		getReactorCurrentConsumptionMethod.invoke(reactorCurrentConsumption); 
	}
	
	public static float getReactorSwitchCooldown() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		float reactorSwitchCooldown;
		Method getReactorSwitchCooldownMethod = PowerInterface.class.getDeclaredMethod("getReactorSwitchCooldown", float.class);
		getReactorSwitchCooldownMethod.setAccessible(true); 
		getReactorSwitchCooldownMethod.invoke(reactorSwitchCooldown); 
	}
	
	public static float getReactorRebootCooldown() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		float reactorRebootCooldown;
		Method getReactorRebootCooldownMethod = PowerInterface.class.getDeclaredMethod("getReactorRebootCooldown", float.class);
		getReactorRebootCooldownMethod.setAccessible(true); 
		getReactorRebootCooldownMethod.invoke(reactorRebootCooldown); 
	}
	
	public static float getRebootTimeSec() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		float rebootTimeSec;
		Method getRebootTimeSecMethod = PowerInterface.class.getDeclaredMethod("getRebootTimeSec", float.class);
		getRebootTimeSecMethod.setAccessible(true); 
		getRebootTimeSecMethod.invoke(rebootTimeSec); 
	}
	
	public static double getActiveReactorIntegrity() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		double activeReactorIntegrity;
		Method getActiveReactorIntegrityMethod = PowerInterface.class.getDeclaredMethod("getActiveReactorIntegrity", double.class);
		getActiveReactorIntegrityMethod.setAccessible(true); 
		getActiveReactorIntegrityMethod.invoke(activeReactorIntegrity); 
	}
	
	public static boolean getIsAnyDamaged() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		double isAnyDamaged;
		Method getIsAnyDamagedMethod = PowerInterface.class.getDeclaredMethod("getIsAnyDamaged", boolean.class);
		getIsAnyDamagedMethod.setAccessible(true); 
		getIsAnyDamagedMethod.invoke(isAnyDamaged); 
	}
	
	public static List getPowerConsumerList() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		List powerConsumerList;
		Method getPowerConsumerListMethod = PowerInterface.class.getDeclaredMethod("getPowerConsumerList", List.class);
		getPowerConsumerListMethod.setAccessible(true); 
		getPowerConsumerListMethod.invoke(powerConsumerList); 
	}
	
	public static long getReactorMaxHp() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		long currentMaxHp;
		Method getCurrentMaxHpMethod = PowerInterface.class.getDeclaredMethod("getCurrentMaxHp", long.class);
		getCurrentMaxHpMethod.setAccessible(true); 
		getCurrentMaxHpMethod.invoke(currentMaxHp); 
	}
	
	public static long getReactorCurrentHp() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		long reactorCurrentHp;
		Method getReactorCurrentHpMethod = PowerInterface.class.getDeclaredMethod("getReactorCurrentHp", long.class);
		getReactorCurrentHpMethod.setAccessible(true); 
		getReactorCurrentHpMethod.invoke(reactorCurrentHp); 
	}
	
	public static double getPowerConsumptionAsPercent() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		long powerConsumptionAsPercent;
		Method getPowerConsumptionAsPercentMethod = PowerInterface.class.getDeclaredMethod("getPowerConsumptionAsPercent", double.class);
		getPowerConsumptionAsPercentMethod.setAccessible(true); 
		getPowerConsumptionAsPercentMethod.invoke(powerConsumptionAsPercent); 
	}
	
	public static float getChamberCapacity() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		float chamberCapacity;
		Method getChamberCapacityMethod = PowerInterface.class.getDeclaredMethod("getChamberCapacity", float.class);
		getChamberCapacityMethod.setAccessible(true); 
		getChamberCapacityMethod.invoke(chamberCapacity); 
	}
	
	public static double getStabilizerEfficiencyTotal() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		double stabilizerEfficiencyTotal;
		Method getStabilizerEfficiencyTotalMethod = PowerInterface.class.getDeclaredMethod("getStabilizerEfficiencyTotal", double.class);
		getStabilizerEfficiencyTotalMethod.setAccessible(true); 
		getStabilizerEfficiencyTotalMethod.invoke(stabilizerEfficiencyTotal); 
	}
	
	public static int getMinSizeNeededForReactorLevel(int level) {
		getNeededMinForReactorLevel(int level);
	}
  
	public static int getMaxSizeNeededForReactorLevel(int level) {
		getNeededMaxForReactorLevel(int level);
	}
}
