package com.github.PedroAntonio;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new Conta("Maria Joana", 100.00, "123456", "PF", 0);
//		conta1.Sacar(100.0);
		for(int i = 0; i < 5; i++) {
			System.out.println("Sacou:" + (conta1.Sacar(100.0))); 
		}
//		conta1.Depositar(100.0);
		for(int i = 0; i < 5; i++) {
			System.out.println("Depositou " + (conta1.Depositar(100.0)));
		}
	}

}