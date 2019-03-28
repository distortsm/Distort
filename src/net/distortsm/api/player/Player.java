package net.distortsm.api.player;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import org.schema.schine.network.StateInterface;

public class Player extends PlayerState {
	
	public Player(StateInterface var1) {
		super(var1);
	}
	
	public static ArrayList<Integer> getSectorCoords() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    	Field sectorField = PlayerState.class.getDeclaredField("currentSector");
    	sectorField.setAccessible(true);
    	Vector3i sectorv = (Vector3i) sectorField.get("currentSector");
    	int x = sectorv.a(0);
    	int y = sectorv.a(1);
    	int z = sectorv.a(2);
    	ArrayList<Integer> sectorCoords = new ArrayList<Integer>();
    	sectorCoords.set(0, x);
    	sectorCoords.set(1, y);
    	sectorCoords.set(2, z);
		return sectorCoords;
  }
}
