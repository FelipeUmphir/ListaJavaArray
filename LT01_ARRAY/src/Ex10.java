public class Ex10 {
	public static void main(String args[]) {
		double [][] matriz = new double[8][8];
		
		matriz = CarregaMatriz(matriz);
		MostraMatriz(matriz);
	}
	
	public static double[][] CarregaMatriz(double ma[][]) {
		int c = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ma[i][j] = Math.pow(2, c);
				c = c + 1;
			}
		}
		
		return ma;
	}
	
	public static void MostraMatriz(double ma[][]) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + ma[i][j]);
			}
		}
	}
}