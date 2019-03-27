package net.distortsm.api.systems;

import org.schema.game.common.controller.elements.power.reactor.PowerInterface;

public class Reactor implements PowerInterface {

  public static Reactor reactor = new Reactor();
  public static double reactorRecharge = getRechargeRatePowerPerSec();
  public static double reactorRechargePercent = getRechargeRatePercentPerSec();
  public static double reactorCurentConsumption = getCurrentConsumptionPerSec();
  public static float reactorSwitchCooldown = getReactorSwitchCooldown();
  public static float reactorRebootCooldown = getReactorRebootCooldown();
  public static float rebootTimeSec = getRebootTimeSec();
  public static double activeReactorIntegrity = getActiveReactorIntegrity();
  public static boolean isDamaged = isAnyDamaged();
  public static List powerConsumerList = getPowerConsumerList();
  public static long reactorMaxHP = getCurrentMaxHp();
  public static long reactorCurrentHP = getCurrentHp();
  public static double powerConsumptionAsPercent = getPowerConsumptionAsPercent();
  public static float chamberCapacity = getChamberCapacity();
  public static double stabilizationEfficiency = getStabilizerEfficiencyTotal();
  
  public static int getMinSizeNeededForReactorLevel(int level) {
	  getNeededMinForReactorLevel(int level);
  }
  
  public static int getMaxSizeNeededForReactorLevel(int level) {
	  getNeededMaxForReactorLevel(int level);
  }
}
