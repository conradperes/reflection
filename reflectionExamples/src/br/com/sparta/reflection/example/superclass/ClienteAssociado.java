package br.com.sparta.reflection.example.superclass;


public class ClienteAssociado extends Cliente {

	public ClienteAssociado(Integer idade) {
		super(idade);
	}
	
	@Override
	public Integer getIdade() {
		System.out.println("recuperando a idade");
		return 17;
	}
}
