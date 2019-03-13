package examen.ejercicio1;

public class contratista  extends Empleado {
Sociedades sociedad;

	public contratista(String nombre, String apellido, String fecha_contratacion, int n_cuenta_bancaria) {
		super(nombre, apellido, fecha_contratacion, n_cuenta_bancaria);
		this.sociedad=sociedad;
		
	}

	public Sociedades getSociedad() {
		return sociedad;
	}

	@Override
	public String toString() {
		return "contratista [sociedad=" + sociedad + "]";
	}


}
