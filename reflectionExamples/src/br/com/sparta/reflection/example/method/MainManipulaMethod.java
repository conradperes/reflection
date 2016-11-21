package br.com.sparta.reflection.example.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainManipulaMethod {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz=Class.forName("br.com.sparta.reflection.example.method.Loja");
		Method[] methods=clazz.getMethods();
		System.out.println("Quantidade de Metodos:"+methods.length);
		methods=clazz.getDeclaredMethods();
		System.out.println("Quantidade de Metodos:"+methods.length);
		Object objLoja=clazz.newInstance();
		setAtributesViaMethod(methods,objLoja);
		System.out.println("Mostrando os valores sem reflexao");
		System.out.println(objLoja);
		System.out.println("Mostrando os valores com reflexao");
		showAtributesViaMethod(methods,objLoja);
	}

	private static void showAtributesViaMethod(Method[] methods, Object objLoja) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		for (Method method : methods) {
			if(Modifier.isPrivate(method.getModifiers())){
				method.setAccessible(true);
			}
			if(method.getName().contains("get")){
				System.out.println(method.getName()+" valor:"+method.invoke(objLoja, new Object[0]));
			}
			if(method.getName().contains("is")){
				System.out.println(method.getName()+" valor:"+method.invoke(objLoja, new Object[0]));
			}
		}
	}

	private static void setAtributesViaMethod(Method[] methods, Object objLoja) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		for (Method method : methods) {
			if(Modifier.isPrivate(method.getModifiers())){
				method.setAccessible(true);
			}
			manipulaAtributos(objLoja, method);
		}
		
	}

	private static void manipulaAtributos(Object objLoja, Method method)
			throws IllegalAccessException, InvocationTargetException {
		if(method.getName().contains("set")){
			if(method.getName().equals("setNome")){
				method.invoke(objLoja, new Object[]{"Posto estrela"});
			}
			if(method.getName().equals("setCpnj")){
				method.invoke(objLoja, new Object[]{382734198219L});
			}
			if(method.getName().equals("setTipo")){
				method.invoke(objLoja, new Object[]{"Postos de Combustivel"});
			}
			if(method.getName().equals("setMatriz")){
				method.invoke(objLoja, new Object[]{true});
			}
		}
	}
	
}
