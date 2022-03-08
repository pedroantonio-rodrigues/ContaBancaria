package com.github.PedroAntonio;

public class Conta {
	public String Nome;
	public Double saldo;
	public String numeroConta;
	public String tipoConta;
	public Integer operacoes;

	public Conta (String nomeUsuario, Double saldo, String numeroConta, String tipoConta, Integer operacoes ) {
		this.Nome = nomeUsuario;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.operacoes = operacoes;
}
	public Double Depositar(Double valor) {
		double ValorDepositar = valor;
		if(tipoConta.equals("PF")) {
			ValorDepositar -= (valor * 0.02);
		} else {
			ValorDepositar  -= valor * 0.01;
		}
		saldo = saldo + ValorDepositar;
		imprimirSaldo();
		return ValorDepositar;
	}

	public double Sacar (Double valor) {
		Double ValorASacar = valor;
		if(ValorASacar > saldo && tipoConta == "PF"){
			valor = 0.0;
			System.out.println("Não é possível sacar valores acima do que possui");
		} else {
			saldo = saldo - valor;
			if (operacoes > 3) {
				if (tipoConta == "PF") {
					ValorASacar -= ValorASacar * 0.02;
				}else {
					ValorASacar -= ValorASacar * 0.01;
				}
			}
		}imprimirSaldo();
		
		operacoes++;
		return ValorASacar;
	}

	
	public Void imprimirSaldo() {
			System.out.println(Nome + " possui " + saldo + " na conta");
			return null;
	}

	
	
}	