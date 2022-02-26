package vehiculos;

public class Motocicleta extends Vehiculo{
	
		
		private int escape;
		
		public Motocicleta (int escape,float  combustible, int pasajero, int ruedas, float velocidadMaxima) {
			
			super(combustible,pasajero,ruedas,velocidadMaxima);
			
			this.escape = escape;
			
			
		}
		@Override
		public void repostar(float combustible) {
			this.combustible = combustible + this.combustible;
			System.out.println("el combustible " + combustible);
		 }
		
		
		/**
		 * Contructor por defecto
		 */
		
		//no entinedo
		public int getescape(){
			return this.escape;
			
		}
		// no entiendo 
		public void setEscape(int tubo) {
			this.escape = tubo + this.escape;
		}
		@Override 
		public void arrancarMotor() {
			
			System.out.println("arrancando motor");
		}

	@Override 
	public void aparcarVehiculo() {
		
		System.out.println("aparcando vehiculo");
		
	}


	}


