package banco;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNomeCliente("Bum");
		//cliente.setNomeCliente("Murilo");
		
		Conta contac = new ContaCorrent(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		contac.depositar(100);
		contac.sacar(100);
		contac.transferir(200, poupanca);
		
		
		
		contac.imprimir();
		poupanca.imprimir();

	}

}
