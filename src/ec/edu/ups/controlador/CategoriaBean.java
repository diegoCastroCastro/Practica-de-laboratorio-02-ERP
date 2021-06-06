package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;

import ec.edu.ups.ejb.CategoriaFacade;

public class CategoriaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private CategoriaFacade ejbCategoriaFacade;
	

	
}
