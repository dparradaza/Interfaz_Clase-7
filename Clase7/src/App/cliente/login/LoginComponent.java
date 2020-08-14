package App.cliente.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import App.cliente.VentanaPrincipal.VentanaPrincipalComponent;
import App.cliente.VentanaPrincipal.VentanaPrincipalTemplate;
import App.cliente.login.loginTemplate;

public class LoginComponent implements ActionListener{

	private loginTemplate loginTemplate;
	private VentanaPrincipalComponent ventanaPrincipal;

    public LoginComponent(){
        this.loginTemplate = new loginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	System.out.print("si");
        if(e.getSource()== loginTemplate.getBEntrar()){
            this.mostrarDatosUsuario();
            this.entrar();
        }
        if(e.getSource()== loginTemplate.getBCerrar()){
        	System.out.print("hola");
            System.exit(0);
        }
       
    }

    public void mostrarDatosUsuario(){
        String nombreUsuario = loginTemplate.getTNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.getTClaveUsuario().getPassword());
        String tipoUsuario = ((String) loginTemplate.getCbTipoUsuario().getSelectedItem()); 
        String check= "";
        if(loginTemplate.getCheckSi().isSelected())
            check="si";
        if(loginTemplate.getCheckNo().isSelected())
            check="no";
        System.out.println("Nombre Usuario: "+nombreUsuario+"\n Clave Usuario: "+claveUsuario+ 
            "\nTipo Usuario: "+tipoUsuario+"\n¿Notificaciones?: "+check);
        
    }

    public void entrar(){
 
        this.ventanaPrincipal = new VentanaPrincipalComponent(this);
        this.ventanaPrincipal.getClass();
        loginTemplate.setVisible(false);
    }

    public loginTemplate getLoginTemplate(){
        return this.loginTemplate;
    }
}