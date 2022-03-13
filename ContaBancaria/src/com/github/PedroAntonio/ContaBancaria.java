package com.github.PedroAntonio;


// Aqui estou definindo a Classe mãe do sistema
public class ContaBancaria
	{
// Atributos da Classe 
		public String Nome;
		public Double saldo;
		public String numeroConta;
		public String tipoConta;
		public Integer saque;
	

	public ContaBancaria (String nomeUsuario, Double saldo, String numeroConta, String tipoConta, Integer Saques ) 
	{
// passando os parametros para a classe
		this.Nome = nomeUsuario;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.saque = Saques;
	}
// definindo a função Sacar
		public void Sacar (double valor) 
		{
			if(this.tipoConta.equals("PJ"))
				{
				
				}
			else if (this.tipoConta.equals("PF")) 
				{
					if(valor > this.saldo) 
					{
						System.out.println("Saldo na conta insuficiente! ");
					}
					else if (saque > 3)
					{
						double taxa = 0.01;
						double desconto = taxa * valor;
						this.saldo -= (desconto - valor);
					}
				}
			
			else if(this.tipoConta.equals("PR")) 
				{
				
				}
					this.saldo -= valor;
					--this.saque;
		}
// definindo a função Depositar 	
		public void Depositar (double valor) 
			{
		if (this.tipoConta.equals("PJ")) 
			{
				double taxa = 0.02;
				double desconto = valor * taxa;
				this.saldo += valor - desconto;
			}
		else if (this.tipoConta.equals("PF")) 
			{
				double taxa = 0.01;
				double desconto = valor * taxa;
				this.saldo += valor - desconto;
			}
		else if(this.tipoConta.equals("PR") && valor <= 1000) {
				double taxa = 0.008;
				double desconto = valor * taxa;
				this.saldo += valor - desconto;
			}
		}
	}