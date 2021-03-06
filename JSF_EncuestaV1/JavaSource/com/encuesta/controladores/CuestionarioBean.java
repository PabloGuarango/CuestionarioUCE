package com.encuesta.controladores;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.encuesta.entidades.Cuestionario;
import com.encuesta.model.servicio.ServicioGenerico;

@ManagedBean
@SessionScoped
public class CuestionarioBean {
	@EJB
	private ServicioGenerico<Cuestionario> servicioCuestionario;
	private Cuestionario cuestionario;
	private String[] selected22; // a-f
	private String[] selected23; // a-h
	private String[] selected24; // a-e
	private String[] selected25; // a-e
	private String[] selected26; // a-f
	@PostConstruct
	public void init() {
		cuestionario = new Cuestionario();
		System.out.println("PostConstruct");
	}
	public Cuestionario getCuestionario() {
		return cuestionario;
	}
	public void setCuestionario(Cuestionario cuestionario) {
		this.cuestionario = cuestionario;
	}
	public String guardar() {
		cuestionario.setFechaEncuesta(new Date());
		if (selected22 != null) {
			for (int i = 0; i < selected22.length; i++) {
				if ("a".equals(selected22[i]))
					cuestionario.setP22a(1);
				if ("b".equals(selected22[i]))
					cuestionario.setP22b(1);
				if ("c".equals(selected22[i]))
					cuestionario.setP22c(1);
				if ("d".equals(selected22[i]))
					cuestionario.setP22d(1);
				if ("e".equals(selected22[i]))
					cuestionario.setP22e(1);
				if ("f".equals(selected22[i]))
					cuestionario.setP22f(1);
				if ("g".equals(selected22[i]))
					cuestionario.setP22g(1);
			}
		}
		if (selected23 != null) {
			for (int i = 0; i < selected23.length; i++) {
				if ("a".equals(selected23[i]))
					cuestionario.setP23a(1);
				if ("b".equals(selected23[i]))
					cuestionario.setP23b(1);
				if ("c".equals(selected23[i]))
					cuestionario.setP23c(1);
				if ("d".equals(selected23[i]))
					cuestionario.setP23d(1);
				if ("e".equals(selected23[i]))
					cuestionario.setP23e(1);
				if ("f".equals(selected23[i]))
					cuestionario.setP23f(1);
				if ("g".equals(selected23[i]))
					cuestionario.setP23g(1);
				if ("h".equals(selected23[i]))
					cuestionario.setP23h(1);
			}
		}
		if (selected24 != null) {
			for (int i = 0; i < selected24.length; i++) {
				if ("a".equals(selected24[i]))
					cuestionario.setP24a(1);
				if ("b".equals(selected24[i]))
					cuestionario.setP24b(1);
				if ("c".equals(selected24[i]))
					cuestionario.setP24c(1);
				if ("d".equals(selected24[i]))
					cuestionario.setP24d(1);
				if ("e".equals(selected24[i]))
					cuestionario.setP24e(1);
			}
		}
		if (selected25 != null) {
			for (int i = 0; i < selected25.length; i++) {
				if ("a".equals(selected25[i]))
					cuestionario.setP25a(1);
				if ("b".equals(selected25[i]))
					cuestionario.setP25b(1);
				if ("c".equals(selected25[i]))
					cuestionario.setP25c(1);
				if ("d".equals(selected25[i]))
					cuestionario.setP25d(1);
				if ("e".equals(selected25[i]))
					cuestionario.setP25e(1);
			}
		}
		if (selected26 != null) {
			for (int i = 0; i < selected26.length; i++) {
				if ("a".equals(selected26[i]))
					cuestionario.setP26a(1);
				if ("b".equals(selected26[i]))
					cuestionario.setP26b(1);
				if ("c".equals(selected26[i]))
					cuestionario.setP26c(1);
				if ("d".equals(selected26[i]))
					cuestionario.setP26d(1);
				if ("e".equals(selected26[i]))
					cuestionario.setP26e(1);
				if ("f".equals(selected26[i]))
					cuestionario.setP26f(1);
			}
		}
		if (cuestionario.getP11() != null && cuestionario.getP12() != null
				&& cuestionario.getP13() != null && cuestionario.getP14() != null
				&& cuestionario.getP15a() != null
				&& cuestionario.getP15b() != null
				&& cuestionario.getP15c() != null
				&& cuestionario.getP15d() != null
				&& cuestionario.getP15e() != null
				&& cuestionario.getP15f() != null
				&& cuestionario.getP15g() != null
				&& cuestionario.getP15h() != null
				&& cuestionario.getP15i() != null
				&& cuestionario.getP15j() != null
				&& cuestionario.getP15k() != null
				&& cuestionario.getP15l() != null
				&& cuestionario.getP15m() != null
				&& cuestionario.getP15n() != null
				&& cuestionario.getP15o() != null
				&& cuestionario.getP15p() != null
				&& cuestionario.getP15q() != null
				&& cuestionario.getP16() != null) {
			servicioCuestionario.guardar(cuestionario);
			cuestionario = new Cuestionario();
			return "/principal.jsf";
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage("Error",
					"Debe llenar la seccion 1"));
			return null;
		}
	}
	public String[] getSelected22() {
		return selected22;
	}
	public void setSelected22(String[] selected22) {
		this.selected22 = selected22;
	}
	public String[] getSelected23() {
		return selected23;
	}
	public void setSelected23(String[] selected23) {
		this.selected23 = selected23;
	}
	public String[] getSelected24() {
		return selected24;
	}
	public void setSelected24(String[] selected24) {
		this.selected24 = selected24;
	}
	public String[] getSelected25() {
		return selected25;
	}
	public void setSelected25(String[] selected25) {
		this.selected25 = selected25;
	}
	public String[] getSelected26() {
		return selected26;
	}
	public void setSelected26(String[] selected26) {
		this.selected26 = selected26;
	}

}
