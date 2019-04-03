package es.prueba.IoC;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo ipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	//Como crear metodo Init. Ejecutar tareas antes de que el bean esté disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init irian las tareas antes de que "
				+ "el bean esté listo");
		
	}
	
	
	//Como crear el metodo destroy. Ejecutar tareas después de que el bean haay sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo init irian las tareas despues de "
				+ "usar el bean");
	}
	
	
}
