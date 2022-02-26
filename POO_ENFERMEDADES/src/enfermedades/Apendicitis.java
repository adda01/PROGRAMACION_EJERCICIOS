package enfermedades;

public class Apendicitis extends Enfermedad {
	
		// poner un extens si vamos a crear una interfaz	


			
			
			private String cerebro;
		private String apendice;
			
			public Apendicitis (String apendice ,String  patia, int cargaViral,int mortalidad, String terapia, String organosSanos, String organosInfectados) {
				super(patia, cargaViral, mortalidad, terapia, organosSanos, organosInfectados);
//				super(cerebro, patia, cargaViral, terapia, organosSanos, organosInfectados);
//				super(patia, cargaViral, mortalidad, terapia,organosSanos, organosInfectados );
				
				this.apendice = apendice;		
			}

			public String getApendice() {
				return cerebro;
			}

			public void setApendice(String apendice) {
				this.apendice = apendice;
			}
			
			public boolean timepoBaja(int x) {
				boolean baja=false;
				System.out.println("El paciente estara de baja "+x+ " dias");
				
				baja=true;
				return baja;
			}
			
			public boolean medicina(String x) {
				boolean medicamentos=false;
				System.out.println("El paciente necesitara "+x+ " durante 2 semanas");
				
				medicamentos=true;
				return medicamentos;
			}

	
			@Override
			public String toString() {
				return "Apendicitis [cerebro=" + cerebro + ", apendice=" + apendice + ", toString()=" + super.toString()
						+ "]";
			}

			public void efectoSecundario(String efecto) {
				System.out.println("el efecto secundario es" + efecto + ", en caso de sufrir de dicho efecto contacte con su medico  ");
				
				
			}
	
		


		}
	
