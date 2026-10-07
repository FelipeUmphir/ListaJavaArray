import javax.swing.JOptionPane;
public class Ex03 {
	public static void main(String[] args) {
		int opc = 0;
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		int[] vetor3 = new int[6];
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregue Vetor1 \n 2 - Carregue Vetor2 \n 3 - Concatenar \n 4 - Mostrar Vetor3 \n 9 - Fim"));
			
			switch (opc) {
				case 1:
					vetor1 = CarregarVetorUm(vetor1);
					break;
				
				case 2:
					vetor2 = CarregarVetorDois(vetor2);
					break;
					
				case 3:
					vetor3 = Concatenar(vetor1, vetor2);
					break;
				
				case 4:
					MostrarVetorTres(vetor3);
					break;
					
				case 9:
					JOptionPane.showMessageDialog(null, "Saindo...");
					System.exit(0);
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida!");
			}
		}
	}
	
	public static int[] CarregarVetorUm(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor inteiro"));
		}
		
		return vet;
	}
	
	public static int[] CarregarVetorDois(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º valor inteiro"));
		}
		
		return vet;
	}
	
	public static int[] Concatenar(int vet1[], int vet2[]) {
		int[] aux = new int[6];
		
		for (int i = 0; i < aux.length; i++) {
			if (i < 3) {
				aux[i] = vet1[i];
			} else {
				aux[i] = vet2[i-3];
			}
		}
		
		System.out.println("Concatenado!");
		System.out.println("***********************");
		
		return aux;
	}
	
	public static void MostrarVetorTres(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Vet3 [" + i + "] = " + vet[i]);
		}
		
		System.out.println("***********************");
	}
}