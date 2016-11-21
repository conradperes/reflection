package br.com.sparta.reflection.example.basic.inteface.exemplos;

public class ClassImplements implements MyInterface,MySecondInterface{

	@Override
	public void doTest() {
		System.out.println(" M�todo doTest executado");
	}

	@Override
	public void test() {
		System.out.println(" M�todo test executado");
		
	}

}
