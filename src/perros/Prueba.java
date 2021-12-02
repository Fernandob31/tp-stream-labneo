package perros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Prueba {

	public static void main(String[] args) {
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		listaPerros.add(new PerroProteccion(1,"Kei", "Pastor Belga Malines", "Macho"));
		listaPerros.add(new PerroProteccion(2,"Matthis", "Pastor Aleman", "Macho"));
		listaPerros.add(new PerroDeteccion(3,"Minnie", "Mestizo", "Hembra"));
		listaPerros.add(new PerroProteccion(4,"Marek", "Pastor Holandes", "Macho"));
		listaPerros.add(new PerroProteccion(5,"Sally", "Pastor Aleman", "Hembra"));
		listaPerros.add(new PerroDeteccion(6,"Leia", "Pastor Australiano", "Hembra"));
		listaPerros.add(new PerroProteccion(7,"Eddie", "Pastor Belga Malines", "Macho"));
		listaPerros.add(new PerroDeteccion(8,"Razor", "Border Collie", "Macho"));
		
		//Generar dos listados a partir de este separando perros de protección de los de detección
		
		//Generando lista de perros de Proteccion
		List<Perro> listaProteccion = new ArrayList<>();
		listaProteccion = listaPerros.stream()
			.filter(c -> c.getTipo() == "Proteccion")
			.collect(Collectors.toList());
		
		//Imprimir la lista con perros de proteccion
		System.out.println("Perros Proteccion:");
		listaProteccion.forEach(p -> System.out.println(p.toString()));
		
		//Generando lista de perros de Deteccion
		List<Perro> listaDeteccion = new ArrayList<>();
		listaProteccion = listaPerros.stream()
			.filter(c -> c.getTipo() == "Deteccion")
			.collect(Collectors.toList());
		
		System.out.println("------------------------------------------");
		
		//Imprimir la lista con perros de Deteccion
		System.out.println("Perros Deteccion:");
		listaProteccion.forEach(p -> System.out.println(p.toString()));
		
		//Obtener el conteo total de machos y de hembras
		
		int cantidadMachos = (int) listaPerros.stream()
				.filter(p -> p.getSexo() == "Macho")
				.count();
		
		int cantidadHembras = (int) listaPerros.stream()
				.filter(p -> p.getSexo() == "Hembra")
				.count();
		
		System.out.println(String.format("Hay %d perros Machos y %d perros Hembra", cantidadMachos, cantidadHembras));

	}

}
