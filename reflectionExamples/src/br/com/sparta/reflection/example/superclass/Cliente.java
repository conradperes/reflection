package br.com.sparta.reflection.example.superclass;

import br.com.sparta.reflection.example.constructor.Pessoa;

public class Cliente extends Pessoa {

	public Cliente(Integer idade) {
		super(idade);
	}
	
	@Override
	public Integer getIdade() {
		System.out.println("Recuperando idade FAKE");
		return 14;
	}
}
