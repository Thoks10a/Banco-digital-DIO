package banco;

public class Cliente {
	
	private String nomeCliente;
	private Double transferValue;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public Double getValue() {
		return transferValue;
	}
	
	public void setValue(double value) {
		this.transferValue = value;
	}

}
