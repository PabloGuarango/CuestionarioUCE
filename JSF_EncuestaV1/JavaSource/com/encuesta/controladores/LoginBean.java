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
			if (user.getCedula().equals(usuario.getCedula())
					&& user.getToken().equals(usuario.getToken())
					&& user.getCorreo().equals(usuario.getCorreo())) {
				System.out.println("Entro>>>>>>>>");
				return "/encuesta.jsf";
			}
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Successful",
				"Your message: " ));
		return null;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
