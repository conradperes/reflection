package br.com.sparta.reflection.example.superclass;

import java.lang.reflect.InvocationTargetException;

public class MainManipulaSuperClass {

	public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
		ClienteAssociado associado = new ClienteAssociado(19);
		System.out.println("Idade do cliente :"+associado.getIdade());
		Class clazz=associado.getClass();
		while (true){
			if(clazz.getSuperclass().equals(Object.class)){
				break;
			}
			clazz=clazz.getSuperclass();
		}
		System.out.println(clazz.getSimpleName());
		Object value = clazz.getDeclaredMethod("getIdade", new Class[0]).invoke(clazz.newInstance(), new Object[0]);
		System.out.println("Idade verdadeira "+value);
	}

}
