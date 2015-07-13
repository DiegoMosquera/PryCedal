package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

//@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void nuevaMaquinaria(){
    	render();
    }
    
    public static void paraNuevo(Maquinaria obj)
    {
    	obj.nombre=obj.nombre+" torno";
    	render(obj);
    	
    }
}