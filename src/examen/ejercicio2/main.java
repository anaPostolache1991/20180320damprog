package examen.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import examen.ejercicio1.*;


public class main {
static List<Empleado>listaEmpleado=new ArrayList<Empleado>();
static List<EmpresaServicios>listaEmpresaServicios=new ArrayList<EmpresaServicios>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpresaServicios e =new EmpresaServicios(Servicios.Catering,"ana",1234);
		EmpresaServicios e2 =new EmpresaServicios(Servicios.limpieza,"afdhd",876564);
		EmpresaServicios e3 =new EmpresaServicios(Servicios.electricidad,"agyha",765786);
		//public EmpresaServicios(Servicios servicios, String nombre, int n_cuenta_bancaria)
		Empleado em=new Empleado("cris","aa","13/03/2019",12345);
		Empleado em2=new Empleado("bbb","ag","11/05/2015",1432);
		Empleado em3=new Empleado("eee","bb","03/11/2011",345);
		//(String nombre, String apellido, String fecha_contratacion, int n_cuenta_bancaria)
		e.pago(100);
		em.pago(200);
		
		
		//añadir emple
		listaEmpleado.add(em);
		listaEmpleado.add(em2);
		listaEmpleado.add(em3);
		 //añadir empresa
		listaEmpresaServicios.add(e);
		listaEmpresaServicios.add(e2);
		listaEmpresaServicios.add(e3);
		
		Iterator it=listaEmpleado.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		Iterator it2=listaEmpresaServicios.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
