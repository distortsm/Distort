package net.distortsm.api.player;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.data.player.PlayerState;

public class Player {
	
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
	public static Object getFactionName() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = PlayerState.class.getClass().getDeclaredMethod("getFactionName");
		method.setAccessible(true);
		Object factionNameObj = method.invoke(getFactionName());
		String factionName = factionNameObj.toString();
		return factionName;
	}
	
	public static Object getFactionID() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = PlayerState.class.getClass().getDeclaredMethod("getFactionId");
		method.setAccessible(true);
		Object factionIDObj = method.invoke(getFactionID());
		String factionID = factionIDObj.toString();
		return factionID;
	}
}
