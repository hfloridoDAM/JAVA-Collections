import java.util.*;

public class Banco {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Pedro", 1234, 3.0f);
		Cuenta cuenta2 = new Cuenta("Juan", 1235, 3.2f);
		Cuenta cuenta3 = new Cuenta("Maria", 1236, 5.0f);
		Cuenta cuenta4 = new Cuenta("Rosa", 1237, 6.1f);
		Cuenta cuenta5 = new Cuenta("Pedro", 1234, 3.0f);
		Cuenta cuenta6 = new Cuenta("Pedro", 1234, 13.0f);
		
		Set<Cuenta> cuentas = new HashSet<Cuenta>();
		
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		cuentas.add(cuenta4);
		cuentas.add(cuenta5);
		cuentas.add(cuenta6);
		
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta.toString());
		}
		
		System.out.println(cuenta1.hashCode());
		System.out.println(cuenta5.hashCode());
		System.out.println(cuenta2.hashCode());
		
		
		if (cuenta1.equals(cuenta5)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		//Ejemplo con HASHMAP
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("Maria", 7);
		mapa.put("Pepe", 4);
		
		for (String clave : mapa.keySet()) {
			System.out.println("Clave: "+clave+" Valor: "+mapa.get(clave));
		}
		
		
	}

}
