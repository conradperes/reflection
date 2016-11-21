package br.com.sparta.reflection.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

import static br.com.sparta.reflection.utils.PrintUtils.print;

public class CollectionHandler implements InvocationHandler {

	private Collection<Object> col;

	public CollectionHandler(Collection<Object> col) {
		super();
		this.col = col;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		print("Interceptando antes do invoke do método: \t" + method.getName());
		long begin = System.currentTimeMillis();
		Object obj = method.invoke(col, args);
		long end = System.currentTimeMillis();
		print("Depois de inteceptar o método=" + method.getName());
		print("Tempo gasto " + (end - begin) + " mili-senconds");
		return obj;
	}
}
