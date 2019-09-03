package net.distortsm.api.systems.reactor;

import java.lang.reflect.Method; 
import java.lang.reflect.InvocationTargetException;
import org.schema.game.common.controller.elements.power.reactor.MainReactorUnit;
import org.schema.game.common.controller.elements.power.reactor.PowerImplementation;
import net.distortsm.api.entity.Entity;

public class Reactor {
	
	//Object Reflectors
	private Object getReactorObject(long var1) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = PowerImplementation.class.getDeclaredMethod("getReactor", long.class);
		method.setAccessible(true); 
		return method.invoke(getReactorObject(var1)); 
	}
		
	//Getters
	private MainReactorUnit getReactorUnit(long var1) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return (MainReactorUnit) getReactorObject(var1);
	}
}
