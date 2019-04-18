package net.distortsm.api.entity;

import net.distortsm.api.entity.Entity;
import net.distortsm.api.systems.Reactor;
import net.distortsm.api.systems.ShieldGroup;

public class Ship {

  public static Entity ship = new Entity();
  public static Reactor reactor = new Reactor();
  public static ShieldGroup shieldGroup = new ShieldGroup();
  private static double reactorRegen = reactor.getRechargeRatePowerPerSec();
  private static double reactorStabilization;
  private static double reactorUsage;
  private static double shieldRegen;
  private static double shieldCapacity;

}
