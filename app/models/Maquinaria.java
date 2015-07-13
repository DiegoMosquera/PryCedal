package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Maquinaria extends Model 
{
	
	public String nombre;
	public String serie;
	public String area;
	public String tipo;
	public String descripcion;
	public Blob imagen;
	
	public Maquinaria(String nombre, String serie, String area, String tipo,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.serie = serie;
		this.area = area;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	

}
