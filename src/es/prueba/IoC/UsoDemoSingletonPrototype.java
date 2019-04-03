package es.prueba.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Carga de XML de configuracion
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Peticion de beans al contenedor Spring
		
		SecretarioEmpleado Paco= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado Maria= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado Manolo= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado Juan= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado Ana= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		System.out.println(Maria);
		
		System.out.println(Paco);
		
		System.out.println(Manolo);
		
		System.out.println(Juan);
		
		System.out.println(Ana);
		
		/*if(Maria == Paco) {
			System.out.println("Apuntan al mismo objeto");
		}else {
			System.out.println("No se trata del mismo objeto");
		}*/
		
	}

}
