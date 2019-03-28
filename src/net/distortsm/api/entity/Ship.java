package net.distortsm.api.entity;

import net.distortsm.api.entity.Entity;
import net.distortsm.api.systems.Reactor;
import net.distortsm.api.systems.ShieldGroup;

public class Ship {

  public static Entity ship = new Entity();
  public static Reactor reactor = new Reactor();
  public static ShieldGroup shieldGroup = new ShieldGroup();
  private static double reactorRegen;
  private static double reactorStabilization;
  private static double reactorUsage;
  private static double shieldRegen;
  private static double shieldCapacity;

  public static getReactorRegen() {
	  return Reactor.reactorReacharge;
  }
  
  public static getReactorRegenPercent() {
	  return Reactor.reactorRechargePercent;
  }
  
  public static getReactorCurrentConsumption() {
	  return Reactor.reactorCurentConsumption;
  }
  
  public static getReactorConsumptionPercent() {
	  return Reactor.powerConsumptionAsPercent;
  }
  
  public static getReactorSwitchCooldown() {
	  return Reactor.reactorSwitchCooldown;
  }
  
  public static getReactorRebootCooldown() {
	  return Reactor.reactorRebootCooldown;
  }
  
  public static getReactorRebootTimeSec() {
	  return Reactor.rebootTimeSec;
  }
  
  public static getActiveReactorIntegrity() {
	  return Reactor.activeReactorIntegrity;
  }
  
  public static isDamaged() {
	  return Reactor.isDamaged;
  }
  
  public static getConsumerList() {
	  return Reactor.powerConsumerList;
  }
  
  public static getReactorMaxHP() {
	  return Reactor.reactorMaxHP;
  }
  
  public static getReactorCurrentHP() {
	  return Reactor.reactorCurrentHP;
  }
  
  public static getReactorChamberCapacity() {
	  return Reactor.chamberCapacity;
  }
}
