package es.prueba.IoC;

public class JefeEmpleado implements Empleados{
	
	public JefeEmpleado(CreacionInformes informeNuevo) {

		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados";
		
		
		
		
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este informe es presentado por el jefe con arreglos: "+ informeNuevo.getInforme();
	}

}
