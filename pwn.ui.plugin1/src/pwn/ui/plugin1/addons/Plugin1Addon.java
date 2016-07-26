 
package pwn.ui.plugin1.addons;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.event.Event;

@SuppressWarnings("restriction")
public class Plugin1Addon {

	@Inject
	@Optional
	public void applicationStarted(
			@EventTopic(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE) Event event, Shell shell) {
		System.out.println("App startet: " + shell.getText());
	}

}
