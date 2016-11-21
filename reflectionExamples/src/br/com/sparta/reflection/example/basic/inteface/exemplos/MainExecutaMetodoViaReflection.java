package br.com.sparta.reflection.example.basic.inteface.exemplos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.com.sparta.reflection.example.basic.inteface.exemplos.ClassImplements;
import br.com.sparta.reflection.example.basic.inteface.exemplos.MySecondInterface;

public class MainExecutaMetodoViaReflection {


	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Class clazz=MySecondInterface.class;
		Method method=clazz.getDeclaredMethod("doTest", new Class[0]);
		method.invoke(new ClassImplements(), new Object[0]);
	}

}
