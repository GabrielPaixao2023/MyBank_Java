package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Gabriel Campos";
		minhaConta.numero = 12289;
		minhaConta.saldo = 200;
		
		System.out.println("Saldo inicial: " + minhaConta.saldo);
		
		///TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma 
		//mensagem de sucesso!
		
		if (minhaConta.sacar(100)) {
			System.out.println("Operação efetuada com sucesso");
		}else {
			System.out.println("Erro...Verifique o saldo!");
		}
		
		System.out.println("Saldo depois de sacar: " + minhaConta.saldo);
		
		
		minhaConta.depositar(500);
		
		System.out.println("Saldo depois de depositar: " + minhaConta.saldo);

	}

}
