package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.DetalleFactura;

@Stateless
public class DetalleFacturaFacade extends AbstractFacade<DetalleFactura>{

	@PersistenceContext(unitName = "Practica-de-laboratorio-02-ERP-master")
	private EntityManager em;
	
	public DetalleFacturaFacade() {
		super(DetalleFactura.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}
