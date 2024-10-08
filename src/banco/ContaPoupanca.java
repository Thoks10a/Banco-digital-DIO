package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimir() {
		try {
			System.out.println("Extrato Conta Poupanca: ");
			if(saldo < cliente.getValue()) {
				System.out.println("Recusado valor de saldo inferior!");
			}else if(cliente.getValue() == null) {
				
			}
		}catch(Exception e){
			System.out.println("Ok...");
		}
		
		super.ImprimirInformacoes();
	}
}
