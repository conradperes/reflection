package br.com.sparta.reflection.example.proxy;

import static br.com.sparta.reflection.utils.PrintUtils.print;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainProxy {

	public static void main(String[] args) {
		Collection<Object> colecaoNaoProxiada = new ArrayList<Object>();
		@SuppressWarnings("unchecked")
		List<Object> colecaoProxiada = (List<Object>) Proxy.newProxyInstance(colecaoNaoProxiada.getClass().getClassLoader()
												, new Class[]{Collection.class,List.class}, new CollectionHandler(colecaoNaoProxiada));
		colecaoProxiada = Arrays.asList("TESTE","TESTE1","TESTE2","TESTE3");
		Collections.sort(colecaoProxiada , (p1,p2) -> new Integer(p1.hashCode()).compareTo(p2.hashCode()));
		colecaoProxiada.forEach(s -> print("Fazendo sort="+s));
		print(colecaoProxiada.toString());
	}

}
