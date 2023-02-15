package util;
public class Funcoes {
	private int conta;
	private String nome;
	private double balanco;
	public Funcoes(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}
	public Funcoes(int conta, String nome, double balanco) {
		this.conta = conta;
		this.nome = nome;
		this.balanco = balanco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public double getBalanco() {
		return balanco;
	}
	public void adicionarDeposito(double valor) {
		balanco += valor;
	}
	public void solicitarSaque(double valor) {
		balanco -= valor + 5.00;
	}
	@Override
	public String toString() {
		return "conta = " + conta + ", nome = " + nome + ", balanco = " + String.format("$ %.2f%n", balanco);
	}	
}
