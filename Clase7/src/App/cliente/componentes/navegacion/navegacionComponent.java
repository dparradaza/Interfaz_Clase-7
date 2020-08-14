package App.cliente.componentes.navegacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import App.cliente.VentanaPrincipal.VentanaPrincipalComponent;

public class navegacionComponent implements ActionListener {

    private NavegacionTemplate navegacionUsuarioTemplate;
    private VentanaPrincipalComponent vistaPrincipalComponent;

    public navegacionComponent(VentanaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        this.navegacionUsuarioTemplate =  new NavegacionTemplate(this);
    }

    
    public NavegacionTemplate getNavegacionUsuarioTemplate() {
        return this.navegacionUsuarioTemplate;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="               <       ") {
			this.vistaPrincipalComponent.mostrarComponente("Cerrar Sesión");
		
		}
		if(e.getActionCommand()=="  Dashboard      ") {
			this.vistaPrincipalComponent.mostrarComponente("Dashboard");
		}
		
		if(e.getActionCommand()=="  Components               >") {
			this.vistaPrincipalComponent.mostrarComponente("components");
		}
		if(e.getActionCommand()=="  Pages                          >") {
			this.vistaPrincipalComponent.mostrarComponente("pages");
			
		}
		
		if(e.getActionCommand()=="  Charts                          >") {
			this.vistaPrincipalComponent.mostrarComponente("charts");
			
		}
		if(e.getActionCommand()=="  Tables                          >") {
			this.vistaPrincipalComponent.mostrarComponente("tables");
			
		}
		
				
	}
}