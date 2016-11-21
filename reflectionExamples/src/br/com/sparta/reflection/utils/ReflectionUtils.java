package br.com.sparta.reflection.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionUtils {

	public static void setAtributesViaMethod(Method[] methods, Object objLoja)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		for (Method method : methods) {
			if (Modifier.isPrivate(method.getModifiers())) {
				method.setAccessible(true);
			}
		}

	}

	public static void makingVisible(Constructor declaredConstructor) {
		if (Modifier.isPrivate(declaredConstructor.getModifiers())) {
			declaredConstructor.setAccessible(true);
		}
	}
}
