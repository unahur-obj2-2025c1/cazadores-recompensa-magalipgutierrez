package culinario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.*;


class Test1 {

	
	private IProfugo profugo1= new Profugo(10, 5, false); 
	private IProfugo profugo2= new Profugo(3, 1, true); 
	private IProfugo profugo3= new Profugo(3, 6, true); 
	private IProfugo profugo4= new Profugo(4, 10, false); //para no cazar
	private IProfugo profugo5= new Profugo(10, 12, true); 
	
	private Set<IProfugo> profugos= new HashSet<>();
	
	private Zona urbana= new Zona("Urbana",profugos );
	private Zona rural= new Zona("Rural",profugos );
	private Zona sigilosa= new Zona("Sigilosa",profugos );
	
	
	
	private CazadorStrategy cazador1= new CazadorUrbano(9,urbana );
	private CazadorStrategy cazador2= new CazadorRural(7,rural );
	private CazadorStrategy cazador3= new CazadorSigiloso(8,sigilosa );
	
	
	@Test
	void cazadorurbano_cazando() {
		
	}
	

}
