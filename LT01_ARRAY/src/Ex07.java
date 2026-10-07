import javax.swing.JOptionPane;
public class Ex07 {

	public static void main(String[] args) {
		int opc = 0;
        int vetor[] = new int[4];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Pesquisa Binaria \n 4 - Mostra Vetor \n 9 - Fim"));
            switch(opc) {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                    
                case 2:
                	vetor = ClassificaVetor(vetor);
                    break;
                
                case 3:
                	int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja procurar: "));
                	
                	int p = PesquisaBinaria(vetor, n);
                	
                	if (p != -1) {
                        System.out.println("O valor esta na posicao: " + p);
                    } else {
                        System.out.println("O valor " + p + " nao existe no vetor!");
                    }
                	
                	System.out.println("***********************");
                    break;
                    
                case 4:
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
	
	public static int PesquisaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (valor < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        
        return -1;
    }
	
	public static void MostraVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet["+ i +"] = " + vet[i]);
        }
        
        System.out.println("***********************");
    }
}