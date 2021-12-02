package perros;

public abstract class Perro {
	private int idPerro;
	private String nombre;
	private String tipo;
	private String raza;
	private String sexo;
	
	public Perro(int id, String nombre, String raza, String sexo) {
		this.idPerro = id;
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdPerro() {
		return idPerro;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d \n Nombre: %s \n Raza: %s \n Sexo: %s\n", this.idPerro, this.nombre, this.raza, this.sexo);
	}
	
}
