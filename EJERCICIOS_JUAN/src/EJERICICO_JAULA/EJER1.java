package EJERICICO_JAULA;

public class EJER1 {
	
public static void ordenar() {
		
		
		
		int nums[]=new int[3];
		
		nums[0]=124;
		nums[1]=124;
		nums[2]=124;
		
		
		int max=nums[0];
		int min=nums[1];
		int medio=nums[2];
		int bolsa=0;
		

		
		if(medio>max) {
			
			bolsa=max;
			max=medio;
			medio=bolsa;
			
			
		}
		if(min>medio) {
			
			
			bolsa=medio;
			medio=min;
			min=bolsa;
			
			
			
		}
		if(medio>max) {
			
			bolsa=max;
			max=medio;
			medio=bolsa;
			
			
			
		}
			
			
			
			
			System.out.println(max + ","+medio+","+min);
			
			
			
			

		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		ordenar();
	
		
		
		
	}


	

}
