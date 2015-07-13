package controllers;

import java.util.*;

import models.Mantenimiento;
import models.Maquinaria;
import play.mvc.Controller;

public class Mantenimientos extends Controller {

    public static void index() {
        List<Mantenimiento>  mantenimientos=Mantenimiento.findAll();
    	render(mantenimientos);
    }
    
    public static void nuevo(){
    	List<Maquinaria> maquinarias=Maquinaria.findAll();
    	render(maquinarias);
    	
    }
    
    public static void guardar(Long id_maquinaria,String fechaInicio, String fechaFin, String tiempoPrevisto, String personal){
    	Maquinaria m=Maquinaria.findById(id_maquinaria);
    	Mantenimiento mantenimiento=new Mantenimiento(fechaInicio,fechaFin,tiempoPrevisto,personal,m);
    	mantenimiento.save();
    	index();
    }
    
    public static void editar(Long id){
    	Mantenimiento mantenimiento= Mantenimiento.findById(id);
    	List<Maquinaria> maquinarias=Maquinaria.findAll();
    	render(mantenimiento,maquinarias);
    }
    
    public static void actualizar(Long id_maquinaria,Long id, String fechaInicio, String fechaFin, String tiempoPrevisto, String personal){
    	
    	Mantenimiento mantenimiento= Mantenimiento.findById(id);
    	mantenimiento.fechaInicio=fechaInicio;
    	mantenimiento.fechaFin=fechaFin;
    	mantenimiento.tiempoPrevisto=tiempoPrevisto;
    	mantenimiento.personal=personal;
    	mantenimiento.maquinaria.id=id_maquinaria;
    	mantenimiento.save();
    	index();
    }
    public static void eliminar(Long id){
    	Mantenimiento mantenimiento= Mantenimiento.findById(id);
    	mantenimiento.delete();
    	index();
    }
}
