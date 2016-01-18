package com.encuesta.controladores;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.encuesta.entidades.Cuestionario;
import com.encuesta.model.servicio.ServicioGenerico;

@ManagedBean
@SessionScoped
public class CuestionarioBean {
	@EJB
	private ServicioGenerico<Cuestionario> servicioCuestionario;
	private Cuestionario cuestionario;
	@PostConstruct
	public void init() {
		cuestionario = new Cuestionario();
	}
	public Cuestionario getCuestionario() {
		return cuestionario;
	}
	public void setCuestionario(Cuestionario cuestionario) {
		this.cuestionario = cuestionario;
	}
	public String guardar(){
		cuestionario.setFechaEncuesta(new Date());
		System.out.println(cuestionario.getP11());
		System.out.println("dasjghfjd????????????????");
		servicioCuestionario.guardar(cuestionario);
		cuestionario=new Cuestionario();
		return "/principal.jsf";
	}
}
