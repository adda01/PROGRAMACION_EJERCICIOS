package enfermedades;

public class  Esquizofrenia extends Enfermedad{
// poner un extens si vamos a crear una interfaz	


	
	
	private String cerebro;
	
	public Esquizofrenia (String cerebro,String  patia, int cargaViral,int mortalidad, String terapia, String organosSanos, String organosInfectados) {
		super(patia, cargaViral, mortalidad, terapia, organosSanos, organosInfectados);
//		super(cerebro, patia, cargaViral, terapia, organosSanos, organosInfectados);
//		super(patia, cargaViral, mortalidad, terapia,organosSanos, organosInfectados );
		
		this.cerebro = cerebro;		
	}

	public String getCerebro() {
		return cerebro;
	}

	public void setCerebro(String cerebro) {
		this.cerebro = cerebro;
	}

	public boolean timepoBaja(int x) {
		boolean baja=false;
		System.out.println("El paciente estara de baja "+x+ " dias");
		
		baja=true;
		return baja;
	}
	
	public boolean medicina(String x) {
		boolean medicamentos=false;
		System.out.println("El paciente necesitara "+x+ " de forma cronica");
		
		medicamentos=true;
		return medicamentos;
	}



	@Override
	public String toString() {
		return "Esquizofrenia [cerebro=" + cerebro + "" + super.toString() + "]";
	}


	public void efectoSecundario(String efecto) {
		System.out.println("el efecto secundario es" + efecto + "en caso de sufrir de estos efecto por favor contacte con su centro medico ");
		
		
	}
	



}
