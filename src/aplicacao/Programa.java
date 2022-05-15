package aplicacao;

import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.CriarChavePix;

public class Programa {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("120.120.120.12", "Alex Green", "alexgreen@gmail.com", "99999-9996");
		Cliente cliente2 = new Cliente("101.101.101.10", "Bob Brown", "bob@gmail.com", "99999-8888");

		Conta cc1 = new ContaCorrente(cliente1);
		Conta cc2 = new ContaCorrente(cliente2);

		cc1.depositar(500);
		cc1.sacar(200);
		cc2.depositar(1000);

		System.out.println(cc1.getSaldo());

		CriarChavePix obj1 = new CriarChavePix();

		obj1.criarChavePix(cliente1);

		System.out.println(cc1.getCliente().getChavePix());

	}

}
