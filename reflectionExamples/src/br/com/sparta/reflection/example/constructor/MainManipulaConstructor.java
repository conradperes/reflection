package br.com.sparta.reflection.example.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.sparta.reflection.utils.ReflectionUtils;

public class MainManipulaConstructor {

	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException,
			InstantiationException, IllegalAccessException, InvocationTargetException {
		Class<Pessoa> clazz = Pessoa.class;
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("Construtores encontrados :" + constructors.length);
		constructors = clazz.getDeclaredConstructors();
		System.out.println("Construtores encontrados :" + constructors.length);
		instanceClassByConstructor(clazz.getDeclaredConstructor(new Class[] { String.class }));
	}

	private static void instanceClassByConstructor(Constructor declaredConstructor)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		ReflectionUtils.makingVisible(declaredConstructor);
		Object obj = declaredConstructor.newInstance(new Object[] { "robson"});
		Pessoa pessoa = (Pessoa) obj;
		System.out.println("Nome recebido pelo construtor via reflex�o " + pessoa.getNome());
	}

}
