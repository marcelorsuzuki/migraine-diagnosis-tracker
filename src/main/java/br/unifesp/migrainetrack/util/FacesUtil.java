package br.unifesp.migrainetrack.util;

import javax.faces.context.FacesContext;

public class FacesUtil {

	public static Object getObjectSession(String el, Class<?> classe) {
		FacesContext context = FacesContext.getCurrentInstance();
		return context.getApplication().evaluateExpressionGet(context, el, classe);
	}
}
