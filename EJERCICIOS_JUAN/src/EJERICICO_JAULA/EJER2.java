package EJERICICO_JAULA;

public class EJER2 {
	
	/*
	 * 
	 * 
	 *
	Tenemos un coche volador y estamos ajustando el motor para que haga parabolas lo más óptimas posibles. 
	Para esto el salto debe ser siempre hacia arriba y, a partir del punto más alto, debe bajar siempre hacia abajo...  
	
	Nuestro mecánico de confianza, nos ha explicado que los saltos se pueden ver como arrays... 
	y que sólo tenemos que asegurarnos que los números suben y bajan de forma correcta. 
	También nos avisa que sólo pasaremos arrays de, como mínimo, tres posiciones.  
	
	Nos ha pasado algunos ejemplos de cómo debería ser nuestra función y algunos resultados:  
	 
	checkSledJump([1, 2, 3, 2, 1]) // true: sube y baja de forma estricta  
	checkSledJump([0, 1, 0]) // -> true: sube y baja de forma estricta  
	checkSledJump([0, 3, 2, 1]) // -> true: sube y baja de forma estricta  
	checkSledJump([0, 1000, 1]) // -> true: sube y baja de forma estricta  
	
	checkSledJump([2, 4, 4, 6, 2]) // false: no sube de forma estricta  
	checkSledJump([1, 2, 3]) // false: sólo sube  
	checkSledJump([1, 2, 3, 2, 1, 2, 3]) // false: sube y baja y sube... ¡no vale!  
	
	
	
	Lo importante: recorrer el array de izquierda a derecha para ver que la subida es siempre estricta, 
	detectar el punto más alto y entonces ver que la bajada es estricta hacia abajo...   

	 * 
	 * */
	
	public static boolean comprobarSaltoVolador(int[] array)
	{
		
	
	
		int numMx=0;
		int ini=array[0];
		int fin=array[array.length-1];
		
		for(int i=1;i<array.length;i++) {
			
			
			
			if(numMx==array[array.length-1]) {
				
				return true;
				
			}
			
			if(array[i-1]==array[i]) {
				
				return true;
				}
			
			if(array[i]>numMx)
				{
				numMx=array[i];
				}
			if(numMx==array[array.length-1]) 
				{
				return true;
				}
			if(array[i]<numMx && array[i] >= array[i-1])
				{
				return true;
				}
			}
			
			while(ini<numMx && fin < numMx) {
				
				return true;
				
			}
			return false;
	}


	public static boolean test1()
	{
		return comprobarSaltoVolador(new int[]{1, 2, 3, 2, 1}) == true;
	}
	
	public static boolean test2()
	{
		return comprobarSaltoVolador(new int[]{0, 1, 0}) ==  true;
	}
	public static boolean test3()
	{
		return comprobarSaltoVolador(new int[]{0, 3, 2, 1}) == true;
	}
	
	public static boolean test4()
	{
		return comprobarSaltoVolador(new int[]{0, 1000, 1}) ==  true;
	}
	
	public static boolean test5()
	{
		return comprobarSaltoVolador(new int[]{2, 4, 4, 6, 2}) == false;
	}
	
	public static boolean test6()
	{
		return comprobarSaltoVolador(new int[]{1, 2, 3}) == false;
	}
	
	public static boolean test7()
	{
		return comprobarSaltoVolador(new int[]{1, 2, 3, 2, 1, 2, 3}) == false;
	}
	
	public static void main(String args[])
	{
		System.out.println("ComprobarSalto");
		System.out.println("	test1 "+test1());
		System.out.println("	test2 "+test2());
		System.out.println("	test3 "+test3());
		System.out.println("	test4 "+test4());
		System.out.println("	test5 "+test5());
		System.out.println("	test6 "+test6());
		System.out.println("	test7 "+test7());
	}



}
