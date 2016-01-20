package com.encuesta.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.encuesta.entidades.Usuario;
import com.encuesta.model.servicio.ServicioGenerico;

@ManagedBean
@SessionScoped
public class LoginBean {
	@EJB
	private ServicioGenerico<Usuario> servicioUsuario;

	private Usuario usuario;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}
	public String validarUsuario() {
		List<Usuario> listUsers = servicioUsuario.obtenerListaCombo("Usuario");
		for (Usuario user : listUsers) {
			if (user.getToken(). equals(usuario.getToken())) {
				System.out.println("Entro>>>>>>>>");
				user.setToken("token123UCE");
				servicioUsuario.actualizar(user);
				usuario = new Usuario();
				return "/encuesta.jsf";
			}
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null	, new FacesMessage("Error",
				"Token incorrecto"));
		return null;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
