package agendaGrafica;

public class Agenda {

	private Contacto[] contactos;
		
	public Agenda () 
	{
		this.contactos = new Contacto[10];
	}
	
	public Agenda (int tamaño) 
	{
		this.contactos = new Contacto[tamaño];
	}
	
	public void añadirContacto(Contacto c) 
	{
		if(existeContacto(c))
		{
			System.out.println("El contacto con ese nombre ya existe");
		}
		else if (agendaLLena())
		{
			System.out.println("La agenda esta llena, no se pueden meter mas contactos");
		}
		else
		{
			boolean encontrado = false;
			for(int i=0; i<contactos.length && !encontrado;i++) 
			{
				if(contactos[i]==null) 
				{
					contactos[i]=c;
					encontrado=true;
				}
			}
			if(encontrado) 
			{
				System.out.println("Se ha añadido");
			}
			else 
			{
				System.out.println("no se ha podido añadir");
			}
		}
		
	}
	
	public boolean existeContacto (Contacto c) //existe conctacto?
	{
		for(int i=0; i<contactos.length;i++) 
		{
			if(contactos[i]!=null && c.equals(contactos[i])) 
			{
				return true;
			}
		}
		return false;
	}
	
	public void listarContactos () //listar contactos
	{
		if(huecosLibres()== contactos.length) 
		{
		System.out.println("no hay contactos para mostrar");
		}
		else {
			for(int i=0; i<contactos.length;i++)
			{
				if(contactos[i]!=null) 
				{
					System.out.println(contactos[i]);
				}
			}
		}
		
	}
	
	public void buscarPorNombre(String nombre) //buscar por nombre
	{
		boolean encontrado = false;
		for(int i=0; i<contactos.length && !encontrado;i++)
		{
			if((contactos[i]!=null) && contactos[i].getNombre().equalsIgnoreCase(nombre))
			{
				System.out.println("Su telefono es" + contactos[i].getTelefono());
				encontrado = true;
			}
		}
		
		if(!encontrado)
		{
			System.out.println("No se ha encontrado el contacto");
		}
	}
	
	public boolean agendaLLena() //agendaLLena
	{
		for(int i=0; i<contactos.length;i++)
		{
			if(contactos[i]==null)
			{
				return false;
				
			}
		}
		
		return true;
	}
	
	public void eliminarContacto(Contacto c) //eliminar contactos
	{
		boolean encontrado = false;
		for(int i=0; i<contactos.length && !encontrado;i++)
		{
			if((contactos[i]!=null) && contactos[i].equals(c))
			{
				contactos[i]=null;
				encontrado=true;
			}
		}
		if(!encontrado)
		{
			System.out.println("No se ha eliminado el contacto");
		}
	}
	
	public int huecosLibres () //huecos Libres
	{
		int contadorLibres=0;
		for(int i=0; i<contactos.length;i++)
		{
			if(contactos[i]!=null) 
			{
				contadorLibres++;
			}
		}
		
		return contadorLibres;
	}
}
