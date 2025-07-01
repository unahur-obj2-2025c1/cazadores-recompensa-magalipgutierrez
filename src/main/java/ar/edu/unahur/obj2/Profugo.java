package ar.edu.unahur.obj2;

public class Profugo implements IProfugo{
	
	private Integer nivelInocencia;
	private Integer nivelHabilidad;
	private Boolean esNervioso;
	
	public Profugo(Integer nivelInocencia, Integer nivelHabilidad, Boolean esNervioso) {
		this.nivelInocencia = nivelInocencia;
		this.nivelHabilidad = nivelHabilidad;
		this.esNervioso = esNervioso;
	}
	@Override
	public Integer getInocencia() {
		
		return nivelInocencia;
	}
	@Override
	public Integer getHabilidad() {
		
		return nivelHabilidad;
	}
	@Override
	public Boolean esNervioso() {
	
		return esNervioso;
	}
	@Override
	public void volverseNervioso() {
		esNervioso=Boolean.TRUE;

		
	}
	@Override
	public void dejarDeEstarNervioso() {
		esNervioso=Boolean.FALSE;
	
		
	}
	@Override
	public void reducirHabilidad() {
		// lo sacamos de cazador Sigiloso
		if (nivelHabilidad>=5) {
			nivelHabilidad-=5;
		}// se podria poner una excepcion - esto ver después
	}
	@Override
	public void disminuirInocencia() {
		if (nivelInocencia<=2) {
			nivelInocencia-=2;
		}// se podria poner una excepcion - esto ver después
		
	}
}
