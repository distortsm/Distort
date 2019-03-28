package net.distortsm.api.player;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.schema.game.common.data.player.PlayerState;

public class Faction {
	
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
