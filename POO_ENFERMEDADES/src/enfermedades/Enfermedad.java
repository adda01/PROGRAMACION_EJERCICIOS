package enfermedades;


public abstract class Enfermedad {
	
	
		
		protected  String patia;
		protected int cargaViral;
		protected int mortalidad;
		protected String terapia;
		protected String organosSanos;
		protected String organosInfectados;
		private static int cantidadenfermedades;
	
		
		
		/**
		 * Constructor por defecto
		 */
	public Enfermedad(){
		
			patia="";
			cargaViral=0;
			mortalidad=0;
			terapia="";
			organosSanos="";
			organosInfectados="";
			cantidadenfermedades++;
		}
		/**
		 * Constructor parametrizado 
		 * @return 
		 */
		public Enfermedad(String patia, int cargaViral , int mortalidad, String terapia, String organosSanos, String organosInfectados){
			this.patia = patia;
			this.cargaViral = cargaViral;
			this.mortalidad=mortalidad;
			this.terapia=terapia;
			this.organosSanos= organosSanos;
			this.organosInfectados =organosInfectados;
		}
		
		/**
		 * Constructor de copia
		 */
		public Enfermedad(Enfermedad enfermedad){
			this.patia = enfermedad.patia;
			this.cargaViral =enfermedad.cargaViral;
			this.mortalidad = enfermedad.mortalidad;
			this.terapia = enfermedad.terapia;
			this.organosSanos= enfermedad.organosSanos;
			this.organosInfectados =enfermedad.organosInfectados;
//			Vehiculo.cantidadVehiculos = Vehiculo.cantidadVehiculos; es estatica ya que vamos a ir contando 
			Enfermedad.cantidadenfermedades ++;
		}
		
	
		
		
		
		@Override
		public String toString() {
			return "Enfermedad [patia =" + patia + ", carga viral de nivel=" + cargaViral + ", mortalidad=" + mortalidad
					+ ", terapia=" + terapia + ", organosSanos=" + organosSanos + ", organosInfectados="
					+ organosInfectados + "]";
		}
		
		public abstract boolean timepoBaja(int x);
		public abstract boolean medicina(String x);
		
		
		

	
	// modifficar dependiendo de la clase 
		protected void setPatia(String dolencia) {
			this.patia = "";
		}

		public String getPatia() {
			return patia;
		}

		public void setCargaViral(int porcentaje) {
			this.cargaViral = porcentaje;
		}

		public int getCartViral() {
			return cargaViral ;
		}
		
		public void setMortalidad(int porcentaje) {
			this.mortalidad = porcentaje;
		}
		public int getMortalidad() {
			return mortalidad;
		}
		

		public String getTerapia() {
			return terapia;
		}
		public void setTerapia(String cura) {
			this.terapia = "";
		}	
		public String getOrganosInfectados() {
			return organosInfectados;
		}
		
		public void setOrganosInfectados(String infectados) {
			this.organosInfectados= infectados;
		}
		public void setOrganosSanos(String sanos) {
			this.organosSanos = sanos;
		}
		public String getOrganosSanos() {
			return organosSanos;
		}
		
	}






