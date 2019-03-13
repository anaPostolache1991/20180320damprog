package examen.ejercicio1;

public class EmpresaServicios implements pago{
Servicios servicios;
private String nombre;
private int n_cuenta_bancaria;
public EmpresaServicios(Servicios servicios, String nombre, int n_cuenta_bancaria) {

	this.servicios = servicios;
	this.nombre = nombre;
	this.n_cuenta_bancaria = n_cuenta_bancaria;
}
public Servicios getServicios() {
	return servicios;
}
public String getNombre() {
	return nombre;
}
public int getN_cuenta_bancaria() {
	return n_cuenta_bancaria;
}
public void setN_cuenta_bancaria(int n_cuenta_bancaria) {
	this.n_cuenta_bancaria = n_cuenta_bancaria;
}
@Override
public void pago( int importe) {
	// TODO Auto-generated method stub

	System.out.println("numero de cuenta bancaria :"+n_cuenta_bancaria+" importe añadido"+importe);
}
@Override
public String toString() {
	return "EmpresaServicios [servicios=" + servicios + ", nombre=" + nombre + ", n_cuenta_bancaria="
			+ n_cuenta_bancaria + "]";
}

}
