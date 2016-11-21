package br.com.sparta.reflection.example.method;

public class Loja {
	  private String nome;
	  private Long cpnj;
	  private String tipo;
	  private boolean matriz;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpnj() {
		return cpnj;
	}
	public void setCpnj(Long cpnj) {
		this.cpnj = cpnj;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isMatriz() {
		return matriz;
	}
	public void setMatriz(boolean matriz) {
		this.matriz = matriz;
	}
	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", cpnj=" + cpnj + ", tipo=" + tipo
				+ ", matriz=" + matriz + "]";
	}
}
