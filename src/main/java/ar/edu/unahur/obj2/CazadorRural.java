package ar.edu.unahur.obj2;

public class CazadorRural extends CazadorStrategy{

	



	public CazadorRural(Integer experiencia, Zona zonaDelCazador) {
		super(experiencia, zonaDelCazador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cazar(IProfugo profugo) {
		if (experiencia > profugo.getHabilidad() && !profugo.esNervioso()) { // esta inicializo en False por eso hay q negar la condicion
			capturados.add(profugo);
			zonaDelCazador.sacarProfugo(profugo);
		}else {
			this.initimidar(profugo);
		}
		
	}

	@Override
	public void initimidar(IProfugo profugo) {
		profugo.disminuirInocencia();
		profugo.volverseNervioso();
		
	}
	



}
