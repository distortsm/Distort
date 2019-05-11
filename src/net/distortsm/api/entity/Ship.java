package net.distortsm.api.entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.schema.game.common.controller.elements.power.reactor.MainReactorUnit;
import org.schema.game.common.controller.elements.power.reactor.PowerInterface;
import net.distortsm.api.entity.Entity;
import net.distortsm.api.systems.Reactor;
import net.distortsm.api.systems.ShieldGroup;

public class Ship {

	private static Object getReactorObject() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerInterface.class.getDeclaredMethod("getReactor", MainReactorUnit.class);
		method.setAccessible(true); 
		return method.invoke(getReactorObject()); 
	}

}
