package entidades;

public class Conta {

	protected static final String MSG_SALDO = "Seu saldo atual é de R$ : %.2f \n";
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Integer numero;
	protected Integer agencia;
	protected Double saldo;
	protected Cliente cliente;

	public Conta() {

	}

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getMSG_SALDO() {
		return MSG_SALDO;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String imprimirInfosComuns() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Titular : %s \n", this.cliente.getNome()));
		sb.append(String.format("Agência : 000%s \n", this.agencia));
		sb.append(String.format("Número : %s \n", this.numero));
		sb.append(String.format("Saldo : R$ %s \n", this.saldo));
		return sb.toString();
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
			System.out.println(String.format(this.cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		} else {
			System.out.println("Operação não pôde ser realizada! Saldo insuficente!");
			System.out.println(String.format(this.cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		}

	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println(String.format("Depósito de  R$ %.2f realizado com sucesso!", valor));
		System.out.println(String.format(cliente.getNome() + " , " + MSG_SALDO, this.saldo));

	}

	public void transferir(Conta contaDestino, double valor) {
		if (this.saldo >= valor) {
			contaDestino.saldo += valor;
			this.saldo -= valor;
			System.out.println(String.format(
					"Transferência de R$ %.2f para " + contaDestino.getCliente().getNome() + " realizada com sucesso !",
					valor));
			System.out.println(String.format(cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		} else {
			System.out.println("Operação não pôde ser realizada! Saldo insuficente!");
			System.out.println(String.format(this.cliente.getNome() + " , " + MSG_SALDO, this.saldo));
		}

	}

}
