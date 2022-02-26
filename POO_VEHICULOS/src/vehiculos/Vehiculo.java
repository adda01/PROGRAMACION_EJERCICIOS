package vehiculos;



public abstract  class Vehiculo {
	
	protected  float combustible;
	protected int pasajero;
	protected int ruedas;
	protected float velocidadMaxima;
	private static int cantidadVehiculos;
	
	
	
	/**
	 * Constructor por defecto
	 */
//	public Vehiculo(){
//		combustible=0;
//		pasajero=0;
//		ruedas=0;
//		velocidadMaxima=0;
//		Vehiculo.cantidadVehiculos++;
//		}
//	
	/**
	 * Constructor parametrizado 
	 */
	public Vehiculo(float combustible, int pasajero , int ruedas, float velocidadMaxima){
		this.combustible = combustible;
		this.pasajero = pasajero;
		this.ruedas=ruedas;
		this.velocidadMaxima=velocidadMaxima;
	}
	
	/**
	 * Constructor de copia
	 */
	public Vehiculo(Vehiculo vehiculo){
		this.combustible = vehiculo.combustible;
		this.pasajero = vehiculo.pasajero;
		this.ruedas = vehiculo.ruedas;
		this.velocidadMaxima = vehiculo.velocidadMaxima;
//		Vehiculo.cantidadVehiculos = Vehiculo.cantidadVehiculos; es estatica ya que vamos a ir contando 
		Vehiculo.cantidadVehiculos ++;
	}
	
	/**
	 * Método abstracto
	 */
	
	public abstract void repostar(float litros);
	
	@Override
	public String toString() {
		return "Vehiculo [combustible=" + combustible + ", pasajero=" + pasajero + ", ruedas=" + ruedas
				+ ", velocidadMaxima=" + velocidadMaxima + "]";
	}

	public abstract void arrancarMotor();
	
	public abstract void aparcarVehiculo();
	
	


	public float getCombustible() {
		return combustible;
	}
// modifficar dependiendo de la clase 
	protected void setCombustible(float litros) {
		this.combustible += litros;
	}

	public int getPasajero() {
		return pasajero;
	}

	public void setPasajero(int plazas) {
		this.pasajero = plazas;
	}

	public int getRuedas() {
		return ruedas ;
	}
	
	public void setRuedas(int diametro) {
		this.ruedas = diametro;
	}
	

	public float getVelocidadMaxima() {
		return velocidadMaxima ;
	}
	
	public void setVelocidadMaxima(int ms) {
		this.velocidadMaxima = ms;
	}
	public float getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	
}



