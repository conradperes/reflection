package br.com.sparta.reflection.example.basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import br.com.sparta.reflection.utils.PrintUtils;

public class Main extends PrintUtils {
	
	
	
	public static void main(String[] args) {
		Class clazz = Pessoa.class;
		print("print os nomes of the fields:"+clazz.getSimpleName());
		print("printing the fields");
		for(Field f:clazz.getDeclaredFields()){
			print("nome do atributo:"+f.getName());
			print("Com os modificadores:"+Modifier.toString(f.getModifiers()));
		}
		for(Method m:clazz.getDeclaredMethods()){
			print("Nome do método:"+m.getName());
			print("Com os modificadores:"+Modifier.toString(m.getModifiers()));
		}
	}
}
