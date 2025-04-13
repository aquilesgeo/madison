package pe.ecdev.madison;

import javax.servlet.http.HttpServletRequest;

public class Util {
	public final static void messageError(HttpServletRequest request, String message) {
		request.setAttribute(Constantes.MESSAGE_ERROR, message);
	}
}
