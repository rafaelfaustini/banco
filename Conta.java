package banco;

public class Conta {
	private int numero;
	private int agencia;
	private float saldo = 0;
	private Cliente titular;
	
	private void setNumero(int numero) {
		this.numero = numero;
	}
	
	private void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	private void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Conta(int numero,int agencia,Cliente titular){ // Construtor, inicialização
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setTitular(titular);
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	private void setSaldo(float valor) {
		this.saldo = valor;
	}
	
	private void retiraConta(float quantia) {
		this.setSaldo(this.getSaldo()-quantia);
	}
	private void insereConta(float quantia) {
		this.setSaldo(this.getSaldo()+quantia);
	}
	
	private boolean canSacar(float quantia) {
		if(this.getSaldo() >= quantia) {
			return true;
		} else
			return false;
	}
	public void sacar(float quantia) {
		if(this.canSacar(quantia)) {
			this.retiraConta(quantia);
		}
	}
	
	private boolean canDepositar(Conta destinatario, float quantia) {
		if(this.getSaldo() >= quantia) {
			if(destinatario!= null) {
				return true;
			}
		}
		return false;
	}
	
	public void depositar(float quantia, Conta conta) {
		if(canDepositar(conta,quantia)) {
			this.retiraConta(quantia);
			conta.insereConta(quantia);
			
		}
	}
	
	
}
