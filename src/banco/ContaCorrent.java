package banco;

public  class ContaCorrent extends Conta {

	public ContaCorrent(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Extrato Conta Corrente: ");
		//System.out.println(transacaoc);
		if(transacaoc == null) {
			System.out.println("Conta alterada!");
		}else {
			System.out.println("Voce possui: "+ saldo + " --> valor de saque: " + transacaoc);
		}
		super.ImprimirInformacoes();
	}
	
}
