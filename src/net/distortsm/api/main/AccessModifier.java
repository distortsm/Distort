package net.distortsm.api.main;

public class AccessModifier {

  public static void main() {
    
    Field playerStateCurrentSector = PlayerState.class.getDeclaredField(currentSector);
    playerStateCurrentSector.setAccessible(true);
    Field playerStateCurrentSystem = PlayerState.class.getDeclaredField(currentSystem);
    playerStateCurrentSystem.setAccessible(true);
    Field playerStateName = PlayerState.class.getDeclaredField(name);
    playerStateName.setAccessible(true);
    Field playerStateHasCreativeMode = PlayerState.class.getDeclaredField(hasCreativeMode);
    playerStateHasCreativeMode.setAccessible(true);
    Field playerStateUseCreativeMode = PlayerState.class.getDeclaredField(useCreativeMode);
    playerStateUseCreativeMode.setAccessible(true);
  }
}
