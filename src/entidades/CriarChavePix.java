package entidades;

import java.util.Scanner;

import services.ServicoCriarChavePix;

public class CriarChavePix  implements  ServicoCriarChavePix{
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void criarChavePix(Cliente cliente){
		System.out.println("Escolha qual tipo de chave PIX deseja criar: \n (1) - email (2) - CPF (3) - Celular ");
		int escolhaUsuario = sc.nextInt();
		if(escolhaUsuario == 1) {
			cliente.setChavePix(cliente.getEmail());
			System.out.println("Chave cadastrada com sucesso! sua chave PIX é " + cliente.getEmail());
		} else if (escolhaUsuario == 2){
			cliente.setChavePix(cliente.getCpf());
			System.out.println("Chave cadastrada com sucesso! sua chave PIX é " + cliente.getCpf());
		} else if (escolhaUsuario == 3) {
			cliente.setChavePix(cliente.getCelular());
			System.out.println("Chave cadastrada com sucesso! sua chave PIX é " + cliente.getCelular());
		} else {
			System.out.println("Opção inválida ");
		}
	}

}
