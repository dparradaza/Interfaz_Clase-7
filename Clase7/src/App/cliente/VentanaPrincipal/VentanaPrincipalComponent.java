package App.cliente.VentanaPrincipal;

import java.awt.Color;

import javax.swing.JFrame;

import App.cliente.componentes.busqueda.BusquedaComponent;
import App.cliente.componentes.dashboard.dashboardComponent;
import App.cliente.componentes.navegacion.navegacionComponent;
import App.cliente.login.LoginComponent;

public class VentanaPrincipalComponent  {

    private VentanaPrincipalTemplate vistaPrincipalTemplate;

    //Declaración Componentes
    private BusquedaComponent barraTituloComponent;
    private navegacionComponent navegacionUsuarioComponent;
    private LoginComponent loginComponent;
    private dashboardComponent dashboardcomponent;

    public LoginComponent getLoginComponent() {
		return loginComponent;
	}

	public void setLoginComponent(LoginComponent loginComponent) {
		this.loginComponent = loginComponent;
	}

	public VentanaPrincipalComponent(LoginComponent loginComponent){
        this.loginComponent = loginComponent;
        this.vistaPrincipalTemplate= new VentanaPrincipalTemplate(this);
        this.navegacionUsuarioComponent = new navegacionComponent(this);
        this.barraTituloComponent = new BusquedaComponent();
        this.dashboardcomponent = new dashboardComponent();
       

        vistaPrincipalTemplate.getPNavegacion().add(
            navegacionUsuarioComponent.getNavegacionUsuarioTemplate()
        );
        vistaPrincipalTemplate.getPBarra().add(
        		barraTituloComponent.getBarraTituloTemplate()
        		);
    }

    public VentanaPrincipalTemplate getVistaPrincipalTemplate(){
        return this.vistaPrincipalTemplate;
    }

	public void mostrarComponente(String comando) {
		vistaPrincipalTemplate.getPPrincipal().removeAll();
		switch (comando) {
		case "Dashboard":
			System.out.print("dash");
			vistaPrincipalTemplate.getPPrincipal().add(dashboardcomponent.getdashboardTemplate());
			break;
		case "components":
			vistaPrincipalTemplate.getPPrincipal().setBackground(Color.black);
			break;
		case "pages":
			vistaPrincipalTemplate.getPPrincipal().setBackground(Color.cyan);

			break;
		case "tables":
			vistaPrincipalTemplate.getPPrincipal().setBackground(Color.BLUE);
			break;
		case "charts":
			vistaPrincipalTemplate.getPPrincipal().setBackground(Color.YELLOW);

			break;
		case "Cerrar Sesión":
			this.loginComponent.getLoginTemplate().setVisible(true);
			this.vistaPrincipalTemplate.setVisible(false);
			break;
		}
		vistaPrincipalTemplate.repaint();
	}
}