package git.main;

import git.entidad.Direccion;
import git.entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestras versiones con Git");
		System.out.println("Esto es otro cambio en el proyecto");
		
		Persona p = new Persona();
		p.setNombre("Steve Rogers");
		p.setEdad(45);
		
		System.out.println(p);
		
		Direccion d = new Direccion();

		d.setNombreVia("Trece Rue del Percebe");
		d.setTipoVia("Calle");
		d.setCiudad("Madrid");
		d.setPais("España");
	}

}
