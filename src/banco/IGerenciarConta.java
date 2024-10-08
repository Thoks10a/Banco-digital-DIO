package banco;

public interface IGerenciarConta {
	
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor,IGerenciarConta conta);
	void imprimir();

}
