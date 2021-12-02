package perros;

public class PerroDeteccion extends Perro implements PerroAction{

	public PerroDeteccion(int id, String nombre, String raza, String sexo) {
		super(id,nombre, raza, sexo);
		setTipo("Deteccion");
	}
	
	@Override
	public void entrenar() {
		System.out.println("Perro entrenado para detección de personas y explosivos");
	}
	public void equipar() {
		System.out.println("Perro equipado con camaras de seguimiento");
	}
	public void asignar() {
		System.out.println("Perro asignado a ubicacion con concurrencia masiva");
	}

}
