package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Manual extends Model {
	
	public Blob archivo;

	@ManyToOne	
	public Maquinaria maquinaria;

	public Manual(Blob archivo, Maquinaria maquinaria) {
		super();
		this.archivo = archivo;
		this.maquinaria = maquinaria;
	}
	
	
	
}
