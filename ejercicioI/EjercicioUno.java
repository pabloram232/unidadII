public class EjercicioUno {
	
	public static int[][] definirDatos(){
		int contador=0;
		int renglon1=0;
		int renglon2=0;
		int renglon3=0;
		int columnas=0;
		int[][] matriz={{25,20,20,50,50,30},
						{20,15,15,80,90,90},
						{15,10,10,40,30,40}};
		
		System.out.println("");
		System.out.println("Enero\tFebrero\tMarzo\tAbril\tMayo\tJunio");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+"\t");
				
				if(contador==0){
					renglon1=renglon1+matriz[i][j];
				}
				if(contador==1){
					renglon2=renglon2+matriz[i][j];
				}
				if(contador==2){
					renglon3=renglon3+matriz[i][j];
				}
				
			}
			contador++;
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Portatil: "+renglon1);
		System.out.println("Mediano: "+renglon2);
		System.out.println("Grande: "+renglon3);
		System.out.println();
		return matriz;
	}
	
	public static void main(String[] args) {
		System.out.println(definirDatos());
	}
        
        
}
