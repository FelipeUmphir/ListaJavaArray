import javax.swing.JOptionPane;
public class Ex08 {
	public static void main(String[] args) {
        int opc = 0;
        int matriz[][] = new int[4][3];
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Cada Produto Mes \n 3 - Total Por Semana \n 4 - Total No Mes \n 9 - Fim"));
            switch(opc) {
                case 1:
                    matriz = CarregaVetor(matriz);
                    break;
                    
                case 2:
                    CadaProdutoMes(matriz);
                    break;
                    
                case 3:
                    TotalPorSemana(matriz);
                    break;
                    
                case 4:
                    TotalMes(matriz);
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
	
	public static int[][] CarregaVetor(int ma[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
            	ma[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto " + j + " vendida na semana " + i + ":"));
            }
        }
        
        return ma;
    }
	
	public static void CadaProdutoMes(int ma[][]) {
		for (int k = 0; k < 3; k++) {
			int p = 0;
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; i++) {
					if (j == k) {
						p = p + ma[i][j];
					} 
				}
			}
		
			System.out.println("O produto " + (k+1) + " teve: " + p + " unidades vendidas");
		
		}
		
		System.out.println("***********************");
	}
	
	public static void TotalPorSemana(int ma[][]) {
		int vet[] = new int[4];
		int c = -1;
		
		for (int i = 0; i < 4; i++) {
			c = c + 1;
			for (int j = 0; j < 3; j++) {
				vet[c] = vet[c] + ma[i][j];
			}
		}
		
		for (int k = 0; k < vet.length; k++) {
			System.out.println("Na semana " + (k + 1) + " foram vendidos " + vet[k] + " produtos");
		}
		
		System.out.println("***********************");
	}
	
	public static void TotalMes(int ma[][]) {
		int s = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				s = s + ma[i][j];
			}
		}
		
		System.out.println("O total de produtos vendidos no mes e: " + s);
		System.out.println("***********************");
	}
}	