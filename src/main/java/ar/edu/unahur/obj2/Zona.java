package ar.edu.unahur.obj2;

import java.util.Set;

public class Zona {
	private String nombre;
	private Set<IProfugo> profugos;
	
	

	
	public Zona(String nombre, Set<IProfugo> profugos) {
	
		this.nombre = nombre;
		this.profugos = profugos;
	
	}
	// ver si va a en cazador
	public void addProfugo(IProfugo p) {
		profugos.add(p);
	}
	public void sacarProfugo(IProfugo p) {
		profugos.remove(p);
	}
	public Set<IProfugo> getProfugos() { //para usar en casadores
		return profugos;
	}
}
