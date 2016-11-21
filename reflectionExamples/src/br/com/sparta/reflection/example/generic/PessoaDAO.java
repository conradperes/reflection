package br.com.sparta.reflection.example.generic;

import br.com.sparta.reflection.example.basic.Pessoa;

public class PessoaDAO extends PseudoDao<Pessoa,Livro>{

	public Pessoa createInstanceViaReflection() throws InstantiationException, IllegalAccessException{
		return getInstanceByFirtsType();
	}
	public Livro createInstanceViaReflectionUsingSecondParam() throws InstantiationException, IllegalAccessException{
		return getInstanceBySecondType();
	}
}
