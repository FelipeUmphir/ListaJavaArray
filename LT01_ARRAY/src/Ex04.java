import javax.swing.JOptionPane;
public class Ex04 {
    public static void main(String[] args) {
        int opc = 0;
        double vetor[] = new double[4];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Media Vetor \n 3 - Acima Media \n 4 - Abaixo Media \n 5 - Mostra Vetor \n 9 - Fim"));
            switch(opc) {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                    
                case 2:
                    MediaVetor(vetor);
                    break;
                
                case 3:
                    AcimaVetor(vetor);
                    break;
                
                case 4:
                	AbaixoVetor(vetor);
                	break;
                	
                case 5:
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
    
    public static double[] CarregaVetor(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor inteiro:"));
        }
        
        return vet;
    }
    
    public static void MediaVetor(double vet[]) {
    	double s = 0;
    	
        for (int i = 0; i < vet.length; i++) {
        	s = s + vet[i];
        }
        
        s = s/vet.length;
        
        System.out.println("A media dos valores e: " + s);
        System.out.println("***********************");
    }
    
    public static void AcimaVetor(double vet[]) {
    	double s = 0;
    	int q = 0;
    	
        for (int i = 0; i < vet.length; i++) {
        	s = s + vet[i];
        }
        
        s = s/vet.length;
        
        for (int j = 0; j < vet.length; j++) {
        	if (vet[j] > s) {
        		q = q + 1;
        	}
        }
        
        System.out.println("A quantidade de valores acima da media e: " + q);
        System.out.println("***********************");
    }
    
    public static void AbaixoVetor(double vet[]) {
    	double s = 0;
    	boolean c = false;
    	
    	for (int i = 0; i < vet.length; i++) {
    		s = s + vet[i];
    	}
    	
    	s = s/vet.length;
    	System.out.println("Os indices dos valores abaixo da media sao:");
    	
    	for (int j = 0; j < vet.length; j++) {
    		if (vet[j] > s) {
    			System.out.println(j);
    			c = true;
    		}	
    	}
    	
    	if (c == false) {
    		System.out.println("Nenhum!");
    	}
    	
    	System.out.println("***********************");
    }
    
    public static void MostraVetor(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet["+ i +"] = " + vet[i]);
        }
        
        System.out.println("***********************");
    }
}