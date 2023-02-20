
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoVitor = new Conta();
		Conta contaDoMoacir = new Conta();
		
		System.out.println(contaDoVitor.titular);
		
		contaDoVitor.titular = "V�tor Bruno";
		contaDoMoacir.titular = "Moacir Ferreira";
		contaDoVitor.saldo = 100;
		contaDoVitor.deposita(50);
		System.out.println(contaDoVitor.saldo);

		boolean consegiuRetirar = contaDoVitor.saca(100);
		System.out.println(consegiuRetirar);
		System.out.println(contaDoVitor.saldo);

		
		contaDoMoacir.saldo = 1000;

		boolean sucessoTransferencia =  contaDoMoacir.transfere(9000, contaDoVitor);
		
		if (sucessoTransferencia) {
			System.out.println("transfer�ncia realizada com sucesso");
		} else {
			System.out.println("O valor do seu saldo � insuficiente para realizar a transfer�ncia");
		}

		System.out.println("Saldo do " + contaDoMoacir.titular + ": " + contaDoMoacir.saldo );
		System.out.println("Saldo do " + contaDoVitor.titular + ": " + contaDoVitor.saldo);
		
		
	}
	
}
