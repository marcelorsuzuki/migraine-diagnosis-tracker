package br.unifesp.migrainetrack.business;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.unifesp.migrainetrack.controller.LoginController;

/**
 * 
 * This class check if the user is logged during the JSF Rendered, and authoriz or not the 
 * user access the View requested.
 *  
 * @author Lineu Lima
 * @author Marcelo Suzuki
 *
 */
public class Authorizer implements PhaseListener {

	private static final long serialVersionUID = -3726881661567529537L;

	/* 
	 * This methdo analyse after JSF restore the view if the user has permission to access
	 * the view requested
	 * 
	 * (non-Javadoc)
	 * @see javax.faces.event.PhaseListener#afterPhase(javax.faces.event.PhaseEvent)
	 */
	@Override
	public void afterPhase(PhaseEvent event) {
		
		
		FacesContext context = event.getFacesContext();
		
		//If the view is Login, it's not necessary to check if the user is logged.
		if ("/login.xhtml".equals(context.getViewRoot().getViewId()) ||
			"/patient.xhtml".equals(context.getViewRoot().getViewId())) {
			return;
		}
		 
		LoginController controller = context.getApplication().evaluateExpressionGet(context, "#{loginC}", LoginController.class);
		
		if (!controller.isLogged()) {
			NavigationHandler handler = context.getApplication().getNavigationHandler();
			handler.handleNavigation(context, null, "login?faces-redirect=true");
			
			context.renderResponse();
		}
		
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}
	
	

}
