package perros;

public class PerroProteccion extends Perro implements PerroAction {

	public PerroProteccion(int id,String nombre, String raza, String sexo) {
		super(id,nombre, raza, sexo);
		setTipo("Proteccion");
	}
	
	@Override
	public void entrenar() {
		System.out.println("Perro entrenado para atacar");
	}
	public void equipar() {
		System.out.println("Perro equipado con chaleco táctico de kevlar");
	}
	public void asignar() {
		System.out.println("Perro asignado a patrullaje general");
	}
}
