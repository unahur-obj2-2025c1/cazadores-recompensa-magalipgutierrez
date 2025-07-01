package ar.edu.unahur.obj2;

public class CazadorSigiloso extends CazadorStrategy{


	public CazadorSigiloso(Integer experiencia, Zona zonaDelCazador) {
		super(experiencia, zonaDelCazador);
	
	}



	@Override
	public void cazar(IProfugo profugo) {
		if(experiencia > profugo.getHabilidad() && profugo.getHabilidad()<50) {
			capturados.add(profugo);
			zonaDelCazador.sacarProfugo(profugo);
		}else {
			this.initimidar(profugo);
		}
		
	}

	

	@Override
	public void initimidar(IProfugo profugo) {
		profugo.reducirHabilidad();
		
	}


}
