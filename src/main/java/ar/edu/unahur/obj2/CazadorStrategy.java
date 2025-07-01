package ar.edu.unahur.obj2;
import java.util.HashSet;
import java.util.Set;
public abstract class  CazadorStrategy {
	

	protected Integer experiencia; 
	protected Zona zonaDelCazador; // lo creamos asi para que cada cazador tenga una zona asignada, si queremos que sea mas dinamico lo pasariamos por paramtro dentro de la funcion cazar
	protected Set<IProfugo> capturados;
	
	public CazadorStrategy(Integer experiencia, Zona zonaDelCazador) {
		
		this.experiencia = experiencia;
		this.zonaDelCazador = zonaDelCazador;
		this.capturados=new HashSet<>(); //para usarlo en todos los tipos de cazadores
	}
	
	
	public abstract void cazar(IProfugo profugo);
	public abstract void initimidar(IProfugo profugo);
	public void sumarExperiencia() {
		experiencia+= (zonaDelCazador.getProfugos().stream().mapToInt(p->p.getHabilidad()).min().orElse(0)) +(2* capturados.size());
	} ;

	
	
}

