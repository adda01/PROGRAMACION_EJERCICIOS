package enfermedades;



public class Principal {
	
	public static void main(String[] args) {
	
	
		Esquizofrenia nombre = new Esquizofrenia("la parte afectada ", "perdida de la consciencia", 10, 10, "2mg de metanfetamina", "no neuronales", "cerebrales y cervicales");
		nombre.timepoBaja(44);
		nombre.medicina("Absetyl");
		System.out.println(nombre);
		nombre.efectoSecundario("mareos, perdida del apetito");
		
		
		Apendicitis nombre2 = new Apendicitis("la parte afectada", "dolor abdominal",45 , 70, "tranfusiones de bioquimicos", "sistema respiratorion, sistema endocrino, sistema reproductivo", "estomago,apendice, organos intestinales");
		nombre2.timepoBaja(7850);
		nombre2.medicina("suero del 85%");
		System.out.println(nombre2);
		nombre2.efectoSecundario("fiebre, sensacion de cansancio");
	}

}


