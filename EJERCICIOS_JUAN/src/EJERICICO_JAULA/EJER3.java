package EJERICICO_JAULA;

import java.util.Arrays;

public class EJER3 {

	/*
	 *   
	Para mejorar la productividad de la tienda en la que trabajamos, 
	vamos a crear una pequeña máquina que calcula el mínimo número de monedas que debemos usar 
	para dar el cambio de una compra en metálico.  
	  
	Las monedas para cambio que puedes usar son estas:   
	  
		coins[0] = 1 céntimo  
		coins[1] = 2 céntimos  
		coins[2] = 5 céntimos  
		coins[3] = 10 céntimos  
		coins[4] = 20 céntimos  
		coins[5] = 50 céntimos  

	
	Tenemos que crear una función que recibe el número de céntimos que hay que devolver al cliente 
	y la función nos da un array con la combinación de monedas mínimas que debemos usar para conseguirlo.  
	   
		getCoins(51) // [1, 0, 0, 0, 0, 1] -> una moneda de 1 céntimo y otra de 50 céntimos  
		getCoins(3) // [1, 1, 0, 0, 0, 0] -> una moneda de 1 céntimo y otra de 2  
		getCoins(5) // [0, 0, 1, 0, 0, 0] -> una moneda de 5 céntimos  
		getCoins(16) // [1, 0, 1, 1, 0, 0] -> una moneda de 1 céntimo, una de 5 y una de 10  
		getCoins(100) // [0, 0, 0, 0, 0, 2] -> dos monedas de 50 céntimos  
	   
	 * 
	 * */
	public static int[] getCoins(int cambio)
	{
	  int[] coins= {0,0,0,0,0,0};
	  
	  		int []cent=new int[6];
	  
	   cent[0]=0;
	   cent[1]=0;
	   cent[2]=0;
	   cent[3]=0;
	   cent[4]=0;
	   cent[5]=0;
	  
	  
	  
	  
	  while(cambio>50) {
		  
		  
		  cent[5]++;
		  cambio =cambio - 50;
	  }
	  while(cambio>20) {
		  
		  cent[4]++;
		  cambio=cambio-20;
	  }
	  while(cambio>10) {
		  
		  cent[3]++;
		  cambio=cambio-10;
	  }
	  while(cambio>5) {
				  
		  cent[2]++;
		  cambio = cambio-5;
	  }
	  while(cambio>2) {
		  
		  cent[1]++;
		  cambio=cambio-2;
	  }
	   
		  cent[0]=cambio;
		  
		  
	  
	  
	  
	  for(int i=0;i<coins.length;i++) {
		  
		  
		  coins[i]=cent[i];
		  
		  
		  
		  
	  }
	  return coins;
	}

	
	public static boolean test1()
	{
		return Arrays.compare(getCoins(51), new int[]{1,0,0,0,0,1})==0;
	}
	
	public static boolean test2()
	{
		return Arrays.compare(getCoins(3), new int[]{1,1,0,0,0,0})==0;
	}
	
	public static boolean test3()
	{
		return Arrays.compare(getCoins(5), new int[]{0,0,1,0,0,0})==0;
	}
	
	public static boolean test4()
	{
		return Arrays.compare(getCoins(16), new int[]{1,0,1,1,0,0})==0;
	}
	
	public static boolean test5()
	{
		return Arrays.compare(getCoins(100), new int[]{0,0,0,0,0,2})==0;
	}
	
	public static boolean test6()
	{
		return Arrays.compare(getCoins(101), new int[]{1,0,0,0,0,2})==0;
	}
	
	public static boolean test7()
	{
		return Arrays.compare(getCoins(111), new int[]{1,0,0,1,0,2})==0;
	}
	
	
	public static boolean test8()
	{
		return Arrays.compare(getCoins(138), new int[]{1,1,1,1,1,2})==0;
	}
	
	public static void main(String[] args)
	{		
		System.out.println("Monedas");
		System.out.println("	test1 "+test1());
		System.out.println("	test2 "+test2());
		System.out.println("	test3 "+test3());
		System.out.println("	test4 "+test4());
		System.out.println("	test5 "+test5());
		System.out.println("	test6 "+test6());
		System.out.println("	test7 "+test7());
		System.out.println("	test8 "+test8());

	}

}
