package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Pedido extends Model{
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String cliente;
    
    @Constraints.Required
    public String detalle;
    
    @Constraints.Required
    public int unidades;
    
    @Constraints.Required
    public int valor;
    
    public static Find<Long,Pedido> find = new Find<Long,Pedido>(){};
}