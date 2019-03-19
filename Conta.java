package banco;

public class Conta {
	private String nomeTitular;
	private int numero;
	private int agencia;
	private float saldo;
	
	public float getSaldo() {
		return this.saldo;
	}
	
	private boolean canSacar(float quantia) {
		if(this.saldo >= quantia) {
			return true;
		} else
			return false;
		
	}
	public void sacar(float quantia) {
		if(canSacar(quantia)) {
			this.saldo -= quantia;
		}
	}
	
	
	
}
