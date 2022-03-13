package com.github.PedroAntonio;

public class Programa {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancariaPJ("João da Silva", 789.99, "123456", "PJ", 3);
		ContaBancaria conta2 = new ContaBancariaPJ("João da Silva", 789.99, "123456", "PF", 3);
		ContaBancaria conta3 = new ContaBancariaPJ("João da Silva", 789.99, "123456", "PR", 3);
		
		System.out.println("===========================");
		System.out.println("Criando conta");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);		
		
		
		conta1.Depositar(100.0); 
		System.out.println("===========================");
		System.out.println("Deposito");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);
		
		
		conta1.Sacar(500.0);
		System.out.println("===========================");
		System.out.println("Saque 1");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.Sacar(500.0);
		System.out.println("===========================");
		System.out.println("Saque 2");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.Sacar(500.0);
		System.out.println("===========================");
		System.out.println("Saque 3");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.Sacar(500.0); 
		System.out.println("===========================");
		System.out.println("Saque 4");
		System.out.println("===========================");
		System.out.println("Conta: " + conta1.numeroConta);
		System.out.println("Titular: " + conta1.Nome);
		System.out.println("Tipo: " + conta1.tipoConta);
		System.out.println("Saldo: " + conta1.saldo);
	}
}
