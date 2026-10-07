public class Ex11 {
	public static void main(String[] args) {
		int matriz[][] = new int[8][8];
		
		matriz = CarregaMatriz(matriz);
		MostraMatriz(matriz);
	}
	
	public static int[][] CarregaMatriz(int ma[][]) {
		for (int d = 0; d < 4; d++) {
			for (int i = 0 + d; i < 8 - d; i++) {
				for (int j = 0 + d; j < 8 - d; j++) {
					ma[i][j] = d + 1;
				}
			}
		}
		
		return ma;
	}
	
	public static void MostraMatriz(int ma[][]) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + ma[i][j]);
			}
		}
	}
}