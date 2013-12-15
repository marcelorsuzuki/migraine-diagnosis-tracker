package br.unifesp.migrainetrack.util;

import javax.faces.context.FacesContext;

public class FacesUtil<T> {

	private Class<T> classe;
	
	
	public T getObjectSession(String className) {
		FacesContext context = FacesContext.getCurrentInstance();
		return (T) context.getApplication().evaluateExpressionGet(context, className, classe);
	}
}
