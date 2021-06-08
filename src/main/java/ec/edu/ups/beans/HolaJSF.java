package ec.edu.ups.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class HolaJSF implements Serializable {
	private static final long serialVersionUID = 1L;
	private String saludo = "Hola mundo jsp";
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	@Override
	public String toString() {
		return "HolaJSF [saludo=" + saludo + "]";
	}
	
			
	

}
