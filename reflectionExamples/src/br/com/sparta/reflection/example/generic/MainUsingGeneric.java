package br.com.sparta.reflection.example.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.sparta.reflection.example.basic.Pessoa;

public class MainUsingGeneric {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		PessoaDAO p = new PessoaDAO();
		Pessoa p1 = p.createInstanceViaReflection();
		System.out.println(p1);
		Livro l = p.createInstanceViaReflectionUsingSecondParam();
		System.out.println(l);
		Map<Pessoa, Livro> list = new HashMap<Pessoa, Livro>();
		ManipulaClass.getClass(list.getClass(), 0);
	}

}
