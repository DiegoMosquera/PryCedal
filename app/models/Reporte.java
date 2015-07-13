package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;


@Entity
public class Reporte extends Model {

    public Date fechaEmision;

}
