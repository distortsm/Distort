package net.distortsm.api.main;

public class AccessModifier {

  public static void main() {
    
    Field playerStateCurrentSector = PlayerState.class.getDeclaredField(currentSector);
    playerStateCurrentSector.setAccessible(true);
    Field playerStateCurrentSystem = PlayerState.class.getDeclaredField(currentSystem);
    playerStateCurrentSystem.setAccessible(true);
    Field playerStateName = PlayerState.class.getDeclaredField(name);
    playerStateName.setAccessible(true);
  }
}
