public class Ex09 {
	public static void main(String args[]) {
		int[][] matriz = new int[4][4]; 
		
		matriz = CarregarMatriz(matriz);
		MostrarMatriz(matriz);
	}
	
	public static int[][] CarregarMatriz(int ma[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					ma[i][j] = (int) Math.pow(4, i);
				} else {
					ma[i][j] = (int) (Math.random() * 10);
				}
			}
		}
		
		return ma;
	}
	
	public static void MostrarMatriz(int ma[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + ma[i][j]);
			}
		}
	}
}