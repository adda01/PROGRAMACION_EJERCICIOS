package vehiculos;

public class  Avion extends  Vehiculo implements ReproductordeMusica , PuedeVolar  {
	
		
		
		private int tamAlas;
		
		public Avion (int tamAlas,float  combustible, int pasajero, int ruedas, float velocidadMaxima) {
			
			super(combustible,pasajero,ruedas,velocidadMaxima);
			
			this.tamAlas = tamAlas;
			
			
		}
		public void repostar(float combustible) {
			this.combustible = combustible + this.combustible;
			System.out.println("el combustible " + combustible);
		 }
		
		
		/**
		 * Contructor por defecto
		 */
		public int getTamAlas(){
			return this.tamAlas;
		}
		
		public void setTamAlas(int cilindrada) {
			this.tamAlas = cilindrada;
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
	public void reproducirCancion(String cancion ) {
		
		System.out.println("se esta reproduciendo la cancion en el avion  " + cancion);
	}
	public String cancionActual() {
		
		return " esta sonando la cancion del avion ";
		// NO LO ENTIENDO 
	}
	public void volar() {
		System.out.println("ESTAMOS VOLANDO");
	}
	
	public void aterrizar(){
		
		System.out.println("ESTAMOS ATERRIZANDO");
		
		}
	@Override
	public String toString() {
		return "Avion [tamAlas=" + tamAlas + ", toString()=" + super.toString() + "]";
	}



	}



