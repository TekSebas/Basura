package es.prueba.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//Creación de objetos de tipo Empleado
		Empleados Empleado1= new DirectorEmpleado();
		
		
		
		//Uso de los objetos creados
		
		System.out.println(Empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan= contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		/*SecretarioEmpleado Paco= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		System.out.println(Paco.getTareas());
		System.out.println(Paco.getInforme());
		System.out.println("Email: "+ Paco.getEmail());
		System.out.println("Empresa: "+Paco.getNombreEmpresa());
		*/
		contexto.close();
		
		
		
	}

}
