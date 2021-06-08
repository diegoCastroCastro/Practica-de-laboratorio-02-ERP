package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.List;
 
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bodega implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String nombre;
	private List<Producto> listaProductos;
	
	public Bodega() {
		super();
	}

	public Bodega(int id, String nombre, List<Producto> listaProductos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaProductos = listaProductos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listaProductos == null) ? 0 : listaProductos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bodega other = (Bodega) obj;
		if (id != other.id)
			return false;
		if (listaProductos == null) {
			if (other.listaProductos != null)
				return false;
		} else if (!listaProductos.equals(other.listaProductos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + ", listaProductos=" + listaProductos + "]";
	}
	
	

}
