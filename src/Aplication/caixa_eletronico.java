package Aplication;
import java.util.Locale;
import java.util.Scanner;
import util.Funcoes;
public class caixa_eletronico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcoes funcoes;
		System.out.print("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre com o seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Gostaria de realizar um deposito inicial (y/n)? ");
		char opcao = sc.next().charAt(0);
		if(opcao == 'y') {
			System.out.print("Entre com o valor do deposito: ");
			double initialDeposit = sc.nextDouble();
			funcoes = new Funcoes(conta, name, initialDeposit);
		}
		else {
			funcoes = new Funcoes(conta, name);
		}
		System.out.println("Dados atualizados ");
		System.out.println(funcoes);
		System.out.print("Novo deposito: ");
		double depositValue = sc.nextDouble();
		funcoes.adicionarDeposito(depositValue);
		System.out.println("Dados atualizado: ");
		System.out.println(funcoes);
		System.out.print("Novo saque: ");
		double saqueValue = sc.nextDouble();
		funcoes.solicitarSaque(saqueValue);
		System.out.println("Dados atualizado ");
		System.out.println(funcoes);	
		sc.close();
		}
	}

