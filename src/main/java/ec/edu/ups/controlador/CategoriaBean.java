package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CategoriaFacade;
import ec.edu.ups.entidad.Categoria; 
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class CategoriaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nombre;
	private int id;
	
	@EJB
	private CategoriaFacade ejbCategoriaFacade;
	private List<Categoria> list;
	
	public CategoriaBean() {

	}

	@PostConstruct
	public void init() {
		// ejbCategoryFacade.create(new Category("Hola"));
		// ejbCategoryFacade.create(new Category("1211"));
		list = ejbCategoriaFacade.findAll();
	}

	public Categoria[] getList() {
		return list.toArray(new Categoria[0]);
	}

	public void setList(List<Categoria> list) {
		this.list = list;
	}

	 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoriaFacade getEjbCategoriaFacade() {
		return ejbCategoriaFacade;
	}

	public void setEjbCategoriaFacade(CategoriaFacade ejbCategoriaFacade) {
		this.ejbCategoriaFacade = ejbCategoriaFacade;
	}

	public String add() {
		ejbCategoriaFacade.create(new Categoria(this.nombre));
		list = ejbCategoriaFacade.findAll();
		return null;
	}

	public String delete(Categoria c) {
		ejbCategoriaFacade.remove(c);
		list = ejbCategoriaFacade.findAll();
		return null;
	}

	public String edit(Categoria c) {
		c.setEditable(true);
		return null;
	}

	public String save(Categoria c) {
		ejbCategoriaFacade.edit(c);
		c.setEditable(false);
		return null;
	}

	
}
