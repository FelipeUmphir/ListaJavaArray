import javax.swing.JOptionPane;
public class Ex02 {
    public static void main(String[] args) {
        int opc = 0;
        int vetor[] = new int[4];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Maior e Menor Vetor \n 3 - Media Vetor \n 4 - Mostra Vetor \n 9 - Fim"));
            switch(opc) {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                    
                case 2:
                    ValoresVetor(vetor);
                    break;
                
                case 3:
                    MediaVetor(vetor);
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
    
    public static void MediaVetor(int vet[]) {
        int s = 0;
        
        for (int i = 0; i < vet.length; i++) {
            s = s + vet[i];
        }
        
        s = s / vet.length;
        
        System.out.println("A media dos valores do vetor e: " + s);
        System.out.println("***********************");
    }
    
    public static void ValoresVetor(int vet[]) {
        int ma = 0, me = 0, n = 0;
        
        while (n < vet.length) {
			int x = vet[n];
				
			if (x > ma) {
				ma = x;
			}
				
			if (x < me) {
	            me = x;
			} else if (me == 0) {
	            me = x;
			}
			    
			n = n + 1;
	    }
        
        System.out.println("O maior valor digitado e " + ma + " e o menor e " + me);
        System.out.println("***********************");
    }
    
    public static void MostraVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet["+ i +"] = " + vet[i]);
        }
        
        System.out.println("***********************");
    }
}