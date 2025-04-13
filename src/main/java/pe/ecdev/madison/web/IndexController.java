package pe.ecdev.madison.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.ecdev.madison.Util;

@Controller
@RequestMapping("")
public class IndexController {
	@RequestMapping("/404.htm")
	public String do404(HttpServletRequest request) {
		Util.messageError(request, "Recurso no encontrado, por favor pongase en contacto con el administrador");
		return "error";
	}
	
	@RequestMapping("/500.htm")
	public String do500(HttpServletRequest request) {
		Util.messageError(request, "A ocurrido un error inesperado, por favor pongase en contacto con el administrador");
		return "error";
	}
}
