package banco;

public interface IGerenciarConta {
	
	void sacar(double valor) throws ExceptionS;
	void depositar(double valor);
	void transferir(double valor,IGerenciarConta conta) throws ExceptionS;
	void imprimir();

}
