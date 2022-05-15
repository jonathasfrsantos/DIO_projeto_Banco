package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);

	}

	@Override
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= (valor + 1.50);
			System.out.println("Saque realizado com sucesso!");
			System.out.println(String.format(this.cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		} else {
			System.out.println("Operação não pôde ser realizada! Saldo insuficente!");
			System.out.println(String.format(this.cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		}

	}

}
