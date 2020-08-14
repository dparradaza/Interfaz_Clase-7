package App.cliente.login;

/***
 * 
 * @author diego
 *
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import App.services.ObjGraficoService;
import App.services.RecursosService;

public class loginTemplate extends JFrame{

	private JPanel pDerecha, pIzquierda;
	private JLabel lEslogan, lNotificaciones, lUsuario, lPortada, lIconos;
	private JTextField tNombreUsuario;
	private JPasswordField tClaveUsuario;
	private JComboBox<String> cbTipoUsuario;
	private JButton bEntrar, bCerrar, bRegistrarse;
	private JCheckBox checkSi, checkNo;
	private ButtonGroup grupo;
	// Declaración decoradores
	private ImageIcon iDimAux, iUsuario, iportada, iIconos;
	private Font fontTPrincipal, fontBotones, fontSubtitulo;
	private Cursor cMano;
	private Border border;
	//DEclarar servicios
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private LoginComponent loginComponent;
	
	public loginTemplate(LoginComponent loginComponent) {
	
        this.loginComponent = loginComponent;
        
		sObjGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();
        
		this.crearObjDecoradores();
		this.crearJPanels();
		this.Jcrearlabels();
		this.crearJTextField();
		this.passwordField();
		this.crearJButtons();
		this.crearcomboBox();
		this.crearCheckBox();
		
		setLayout(null);
		setSize(1000, 500);
		setLocationRelativeTo(this);
		setUndecorated(true);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void crearJPanels() {

        pIzquierda = sObjGraficos.construirJPanel(
            0, 0, 600, 500, new Color(245, 245, 245), null
        );
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(
            600, 0, 400, 500, sRecursos.getColorAzul(), null
        );

		this.add(pDerecha);
	}

	public void crearJTextField() {
		tNombreUsuario =sObjGraficos.construirJTextField("Usuario", 
				((pDerecha.getWidth() - 300)/ 2),120,300,40, 
				new Color(78, 115, 223), sRecursos.getColorGrisOscuro(), 
				sRecursos.getColorGrisOscuro(), sRecursos.getFontBotones(), sRecursos.getBorder(), "c");

		pDerecha.add(tNombreUsuario);

	}
	
	public void passwordField() {
		tClaveUsuario = sObjGraficos.construirJPasswordField("", ((pDerecha.getWidth() - 300) / 2), 180, 300,
				40, new Color(78, 115, 223), Color.DARK_GRAY, Color.BLUE, null,
				border, "c");
		pDerecha.add(tClaveUsuario);

	}
	
	public void crearJButtons() {
		bEntrar = sObjGraficos.construirJButton("Siguiente >", (pDerecha.getWidth() - 125 / 2) - 125, 300, 125, 45,
				sRecursos.getcMano(), null, sRecursos.getFontBotones(),sRecursos.getColorAzul(), Color.WHITE, null, "c", true);
		bEntrar.addActionListener(loginComponent);
		pDerecha.add(bEntrar);
		
		
		bRegistrarse = sObjGraficos.construirJButton("Registrarse", (pDerecha.getWidth() - 125 / 2) - 280, 300, 125, 45,
				sRecursos.getcMano(), null, sRecursos.getFontBotones(),sRecursos.getColorAzul(), Color.WHITE, null, "c", true);
		bRegistrarse.addActionListener(loginComponent);
		pDerecha.add(bRegistrarse);
		
		
		bCerrar = sObjGraficos.construirJButton("X", 330, 10, 45, 30,
				sRecursos.getcMano(), null, sRecursos.getFontBotones(),sRecursos.getColorAzul(), Color.WHITE, null, "c", true);
		bCerrar.addActionListener(loginComponent);
		pDerecha.add(bCerrar);

	}
	
	public void Jcrearlabels() {
        //LABEL TITULO LOGIN-----------------------------------------------------------------------------
        lEslogan = sObjGraficos.construirJLabel(
            "Iniciar sesión", (pDerecha.getWidth() - 60) / 2, 40, 190, 20, 
            null, Color.DARK_GRAY, null, sRecursos.getFontTPrincipal(), "c"
        );
        pIzquierda.add(lEslogan);
		
        lNotificaciones = sObjGraficos.construirJLabel(
                "¿Recordar contraseña?", (pDerecha.getWidth() - 190) / 2, 360, 190, 20, 
                null, Color.DARK_GRAY, null, sRecursos.getFontSubtitulo(), "c"
            );
		pDerecha.add(lNotificaciones);
		
		iDimAux = new ImageIcon(sRecursos.getiUsuario().getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
	    lUsuario= sObjGraficos.construirJLabel(null,(pDerecha.getWidth() / 2) - 30, 60, 60, 60, iDimAux, null, null, null, "c");
	    pDerecha.add(lUsuario);
		
		iDimAux = new ImageIcon(sRecursos.getIportada().getImage().getScaledInstance(350, 350, Image.SCALE_AREA_AVERAGING));
		lPortada= sObjGraficos.construirJLabel(null,(pDerecha.getWidth() / 2) - 100, 60, 360, 360, iDimAux, null, null, null, "c");
		pIzquierda.add(lPortada);
		
		iDimAux = new ImageIcon(sRecursos.getiIconos().getImage().getScaledInstance(170, 50, Image.SCALE_AREA_AVERAGING));
		lIconos=sObjGraficos.construirJLabel(null,30, 370, 180, 100, iDimAux, null, null, null, "c");
		pIzquierda.add(lIconos);

	}
	
	public void crearObjDecoradores() {
		// decoradores
	}
	
	public void crearCheckBox() {

        checkSi = sObjGraficos.construirJCheckBox(
            "Si", ((pDerecha.getWidth() - 45) / 2 - 15), 385, 45, 25, sRecursos.getcMano(), null, null
        );
        pDerecha.add(checkSi);

        checkNo = sObjGraficos.construirJCheckBox(
            "No", ((pDerecha.getWidth() - 45) / 2 +25), 385, 45, 25, sRecursos.getcMano(), null, null
        );
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);
		
	}
	
	public void crearcomboBox() {
		cbTipoUsuario = sObjGraficos.construirJComboBox("Usuario_Admin_Invitado", (pDerecha.getWidth() - 300) / 2,
				240, 300, 40, sRecursos.getColorAzul(), Color.WHITE, "c", sRecursos.getFontBotones());
		pDerecha.add(cbTipoUsuario);


	}



    public JButton getBCerrar(){
        return this.bCerrar;
    }

    public JButton getBEntrar(){
    	
        return this.bEntrar;
    }

    public JButton getBRegistrarse(){
        return this.bRegistrarse;
    }


    public JTextField getTNombreUsuario(){
        return this.tNombreUsuario;
    }

    public JPasswordField getTClaveUsuario(){
        return this.tClaveUsuario;
    }

    public JComboBox<String> getCbTipoUsuario(){
        return this.cbTipoUsuario;
    }

    public JCheckBox getCheckSi(){
        return this.checkSi;
    }

    public JCheckBox getCheckNo(){
        return this.checkNo;
    }

}
