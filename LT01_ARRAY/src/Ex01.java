import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String[] args) {
        int opc = 0;
        int vetor[] = new int[4];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Media Vetor \n 3 - Soma Vetor \n 4 - Mostra Vetor \n 9 - Fim"));
            switch(opc) {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                    
                case 2:
                    MediaVetor(vetor);
                    break;
                
                case 3:
                    SomaVetor(vetor);
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
        int s = 0, c = 0;
        
        for (int i = 0; i < vet.length; i++) {
            if (10 < vet[i] && vet[i] < 200){
                s = s + vet[i];
                c = c + 1;
            }
        }
        
        if (c > 0) {
            s = s / c;
            System.out.println("A media dos valores entre 10 e 200 e: " + s);
        } else {
            System.out.println("Nao existem valores entre 10 e 200 no vetor!");
        }
        
        System.out.println("***********************");
    }
    
    public static void SomaVetor(int vet[]) {
        int s = 0;
        
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0){
                s = s + vet[i];
            }
        }
        
        System.out.println("A soma dos numeros impares e: " + s);
        System.out.println("***********************");
    }
    
    public static void MostraVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet["+ i +"] = " + vet[i]);
        }
        
        System.out.println("***********************");
    }
}