import javax.swing.JOptionPane;
public class Ex06 {
	public static void main(String[] args) {
        int opc = 0;
        int vetor[] = new int[20];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
            switch(opc) {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                    
                case 2:
                    vetor = ClassificaVetor(vetor);
                    break;
                    
                case 3:
                    MostraVetor(vetor);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opcao Invalida!");
            }
        }
    }
	
	public static int[] CarregaVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor inteiro:"));
        }
        
        return vet;
    }
	
	public static int[] ClassificaVetor(int vet[]) {
		int a = 0;
		
		for (int i = 0; i < (vet.length - 1); i++) {
			for (int j = (i + 1); i < vet.length; j++) {
				if (vet[i] < vet[j]) {
					a = vet[j];
					vet[j] = vet[i];
					vet[i] = a;
				}
			}
		}
		
		System.out.println("Classificado!");
		System.out.println("***********************");
		
		return vet;
	}
	
	public static void MostraVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet["+ i +"] = " + vet[i]);
        }
        
        System.out.println("***********************");
    }
}