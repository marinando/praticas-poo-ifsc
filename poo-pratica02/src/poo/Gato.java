package poo;

public class Gato extends Animal{
	private String nome;
	private String raca;
	private Float comprimento;
	private Integer numPatas;
	private String cor;
	private String ecossistema;
	
	public Gato(String nome, String raca, Float comprimento, Integer numPatas, String cor, String ecossistema){
		this.nome = nome;
		this.raca = raca;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ecossistema = ecossistema;
		
	}
	public Gato() {
		
	}
	public void mia() {
		
	}
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public Integer getNumPatas() {
		return numPatas;
	}
	public String getCor() {
		return cor;
	}
	public String getEcossistema() {
		return ecossistema;
	}
}
