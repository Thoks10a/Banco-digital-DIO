package banco;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNomeCliente("Jubiscreuson");
		
		Conta conta = new ContaCorrent(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		conta.depositar(500);
		conta.transferir(200, poupanca);
		
		conta.imprimir();
		poupanca.imprimir();

	}

}
