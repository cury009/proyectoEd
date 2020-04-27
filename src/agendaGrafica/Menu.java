package agendaGrafica;

import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; //guarda la opcion
		
		Agenda agendaTelefonica = new Agenda(3);
		String nombre;
		int telefono;
		String email;
		String direccion;
		Contacto c;
		
		while (!salir)
		{
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar contacto");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Existe contacto");
			System.out.println("5. Eliminar contacto");
			System.out.println("6. Contactos disponibles");
			System.out.println("7. Agenda llena");
			System.out.println("8. salir");
			
				System.out.println("Escribe una de las opciones" );
				opcion = sn.nextInt();
				sn.nextLine();
				
				switch (opcion)
				{
				case 1:
					System.out.println("Escribe un nombre");
					nombre = sn.nextLine();
					
					System.out.println("Escribe un telefono");
					telefono = sn.nextInt();
					sn.nextLine();
					System.out.println("escribe un email");
					email = sn.nextLine();
					System.out.println("escribe una direccion");
					direccion = sn.nextLine();
					
					c = new Contacto(nombre, telefono,email,direccion);
					
					agendaTelefonica.añadirContacto(c); 
					break;
				case 2:
					agendaTelefonica.listarContactos();
					break;
				case 3:
					System.out.println("Escribe un nombre");
					nombre = sn.nextLine();
					
					
					agendaTelefonica.buscarPorNombre(nombre);
					break;
				case 4:
					System.out.println("Escribe un nombre");
					nombre = sn.nextLine();
					
					
					c = new Contacto(nombre, 0,null,null);
					agendaTelefonica.añadirContacto(c);
					
					if(agendaTelefonica.existeContacto(c))
					{
						System.out.println("Existe contacto");
					}
					else
					{
						System.out.println("No existe contacto");
					}
					
					break;
				case 5:
					System.out.println("Escribe un nombre");
					nombre = sn.nextLine();
					
					
					c= new Contacto (nombre,0,null,null);
					
					agendaTelefonica.eliminarContacto(c);
					break;
				case 6:
					System.out.println("Hay "+agendaTelefonica.huecosLibres()+ " contactos");
					break;
				case 7:
					if(agendaTelefonica.agendaLLena())
					{
						System.out.println("La agenda esta llena");
					}
					else
					{
						System.out.println("Aun puedes meter contactos");
					}
					break;
				case 8:
					salir = true;
					break;
				default: 
					System.out.println("Solo numeors entre 1 y 8");
				}
					
		}	
	}
}
