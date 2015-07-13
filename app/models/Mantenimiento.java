package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;


@Entity
public class Mantenimiento extends Model {
	
    
	public String fechaInicio;
    public String fechaFin;
    public String tiempoPrevisto;
    public String personal;
    
    @ManyToOne
    public Maquinaria maquinaria;

	public Mantenimiento(String fechaInicio, String fechaFin,
			String tiempoPrevisto, String personal, Maquinaria maquinaria) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tiempoPrevisto = tiempoPrevisto;
		this.personal = personal;
		this.maquinaria = maquinaria;
	}
    
	
   
}
