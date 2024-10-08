package banco;

public class ContaCorrent extends Conta {

	public ContaCorrent(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Extrato Conta Corrente: ");
		super.ImprimirInformacoes();
	}
	
}
