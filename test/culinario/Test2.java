package culinario;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.CazadorRural;
import ar.edu.unahur.obj2.CazadorSigiloso;
import ar.edu.unahur.obj2.CazadorStrategy;
import ar.edu.unahur.obj2.CazadorUrbano;
import ar.edu.unahur.obj2.IProfugo;
import ar.edu.unahur.obj2.Profugo;
import ar.edu.unahur.obj2.Zona;

public class Test2 {
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
		profugos.add(profugo1);
		profugos.add(profugo2);
		profugos.add(profugo3);
		profugos.add(profugo4);
		profugos.add(profugo5);
		
		cazador1.cazar(profugo1);
		cazador1.cazar(profugo2);
		cazador1.cazar(profugo3);
		cazador1.cazar(profugo4);
		cazador1.cazar(profugo5);
		
		cazador1.sumarExperiencia();
		
		assertEquals(2, urbana.getProfugos().size());
	
	}
}
