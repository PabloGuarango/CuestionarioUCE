package com.encuesta.model.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 * Clase base para obtener un entity manager de conexion a la base de datos del
 * ERP
 * 
 * @author Andres Guarango
 * @version 1.0
 */
public class EncuestaDBBase {
	@PersistenceContext
	protected EntityManager em;
}
