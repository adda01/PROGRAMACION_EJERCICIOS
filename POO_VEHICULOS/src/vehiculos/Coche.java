
package vehiculos;


public class Coche extends Vehiculo implements ReproductordeMusica{
	
	
	private int cilindrada;
	
	public Coche (int cilindrada,float  combustible, int pasajero, int ruedas, float velocidadMaxima) {
		
		super(combustible,pasajero,ruedas,velocidadMaxima);
		
		this.cilindrada = cilindrada;
		
		
	}
	@Override
	public void repostar(float combustible) {
		this.combustible = combustible + this.combustible;
		System.out.println("el combustible " + combustible);
	 }
	
	
	/**
	 * Contructor por defecto
	 */
	
	
	public int getCilindrada(){
		return this.cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override 
	public void arrancarMotor() {
		
		System.out.println("arrancando motor");
	}

public void aparcarMotor() {
		
	System.out.println("aparcando motor");
	}
@Override 
public void aparcarVehiculo() {
	
	System.out.println("aparcando vehiculo");
	
}

@Override
public String cancionActual() {
	
	return "suena la cancion del coche";
}
@Override
public void reproducirCancion(String cancion) {
	System.out.println("esta sonando esta cancion" + cancion + "en el coche ");
	
	
}
@Override
public String toString() {
	return "Coche [cilindrada=" + cilindrada + ", toString()=" + super.toString() + "]";
}
 


}
