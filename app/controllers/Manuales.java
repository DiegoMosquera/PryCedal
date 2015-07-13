package controllers;

import java.io.File;
import java.util.*;

import models.Mantenimiento;
import models.Manual;
import models.Maquinaria;
import play.db.jpa.Blob;
import play.mvc.*;

public class Manuales extends Controller {

    public static void index() {
        List<Manual> manuales = Manual.findAll();
    	render(manuales);
    }
    
    public static void nuevo(){
    	List<Manual> manuales=Manual.findAll();
    	render(manuales);
    }
    
    public static void guardar(Long id_maquinaria,Blob archivo){
    	Maquinaria m=Maquinaria.findById(id_maquinaria);
    	Manual manual=new Manual(archivo,m);
    	manual.save();
    	index();
    }

}
