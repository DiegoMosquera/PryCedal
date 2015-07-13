package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import models.Mantenimiento;
import models.Maquinaria;
import play.db.jpa.Blob;
import play.libs.MimeTypes;
import play.mvc.*;

public class Maquinarias extends Controller {

    public static void index() {
        List<Maquinaria> maquinarias = Maquinaria.findAll();
    	render(maquinarias);
    }
    
    public static void nuevo(){
    	render();
    }
    
    public static void guardar(String nombre, String serie, String area, String tipo, String descripcion) throws FileNotFoundException{
    	Maquinaria maquinaria=new Maquinaria(nombre,serie,area,tipo,descripcion);
    	maquinaria.save();
    	index();
    }
    public static void editar(Long id){
    	Maquinaria maquinaria= Maquinaria.findById(id);
    	render(maquinaria);
    }
    
    public static void actualizar(Long id, String nombre, String serie, String area, String tipo, String descripcion){
    	
    	Maquinaria maquinaria= Maquinaria.findById(id);
    	maquinaria.nombre=nombre;
    	maquinaria.serie=serie;
    	maquinaria.area=area;
    	maquinaria.tipo=tipo;
    	maquinaria.descripcion=descripcion;
    	maquinaria.save();
    	index();
    }
    public static void eliminar(Long id){
    	Maquinaria maquinaria= Maquinaria.findById(id);
    	maquinaria.delete();
    	index();
    }

}
