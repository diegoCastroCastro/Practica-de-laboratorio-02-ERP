package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Factura;

@Stateless
public class FacturaFacade extends AbstractFacade<Factura>{
	
	@PersistenceContext(unitName = "Practica-de-laboratorio-02-ERP-master")
	private EntityManager em;
	
	public FacturaFacade() {
		super(Factura.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
