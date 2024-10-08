package banco;

public abstract class Conta implements IGerenciarConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Double transacaos;
	protected Double transacaoc;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo < valor) {
			transacaoc = valor;
			
		}else {
			saldo -= valor;
		}
		
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IGerenciarConta contaDestino) {
		if(saldo < valor) {
			//transacaos = valor;
			cliente.setValue(valor);
		}else {
			
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		}

	}
	
	
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	/*public double getTransacaos() {
		return transacaos;
	}
	
	public void setTransacaos(double valor) {
		this.transacaos = valor;
	}*/

	protected void ImprimirInformacoes() {
		System.out.println(String.format("Titular da Conta: %s", this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("------------------------------------"));
	}

}
