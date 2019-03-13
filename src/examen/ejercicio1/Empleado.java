package examen.ejercicio1;

public class Empleado implements pago{
private String nombre;
private String apellido;
private String fecha_contratacion;
private int n_cuenta_bancaria;
public Empleado(String nombre, String apellido, String fecha_contratacion, int n_cuenta_bancaria) {

	this.nombre = nombre;
	this.apellido = apellido;
	this.fecha_contratacion = fecha_contratacion;
	this.n_cuenta_bancaria = n_cuenta_bancaria;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public String getFecha_contratacion() {
	return fecha_contratacion;
}
public int getN_cuenta_bancaria() {
	return n_cuenta_bancaria;
}
public void setN_cuenta_bancaria(int n_cuenta_bancaria) {
	this.n_cuenta_bancaria = n_cuenta_bancaria;
}
@Override
public void pago(int importe) {
	// TODO Auto-generated method stub
	System.out.println("numero de cuenta bancaria :"+n_cuenta_bancaria+" importe añadido"+importe);
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", fecha_contratacion=" + fecha_contratacion
			+ ", n_cuenta_bancaria=" + n_cuenta_bancaria + "]";
}

}
