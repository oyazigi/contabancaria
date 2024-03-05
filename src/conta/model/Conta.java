package conta.model;

import conta.util.Cores;

public class Conta {
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public boolean Sacar(float valor) {
		if(this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.printf("Saque realizado com sucesso!\nNovo saldo: %f\n", this.getSaldo());
			return true;
		}
	}
	
	public void Depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.printf("Deposito realizado com sucesso!\nNovo saldo: %f\n", this.getSaldo());
	}
	
	public void visualizar() {
		String tipo = "";
		if(this.tipo == 1)tipo = "Conta Corrente";
		else tipo = "Conta Poupança";
		System.out.println(Cores.TEXT_GREEN +
				"———————————————————————————————————————————————————————————————————");
		System.out.println("Número da conta:" + this.numero);
		System.out.println("Agência da conta:" + this.agencia);
		System.out.println("Tipo da conta:" + this.tipo);
		System.out.println("Títular da conta:" + this.titular);
		System.out.println("Saldo da conta:" + this.saldo);
		System.out.println("———————————————————————————————————————————————————————————————————");
	}
}
