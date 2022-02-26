package vehiculos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion avion = new Avion(5, 50.0f, 67, 7, 1000f);
		avion.aterrizar();
		
		System.out.println(avion);
		
//		Coche coche = new Coche(20, 20.0f, 88, 7, 10000f) {
//			coche.cilindrada();
//		}
	}

}
