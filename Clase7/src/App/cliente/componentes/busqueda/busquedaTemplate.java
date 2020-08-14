package App.cliente.componentes.busqueda;

import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import App.services.ObjGraficoService;
import App.services.RecursosService;

public class busquedaTemplate extends JPanel{
    

    
	private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;

    //Declaración objetos gráficos
    private JLabel lLogoApp, lUsuario,lMensajes,lNotificacion;
    private JButton bCerrar,bBuscar;
    private JTextField tBusqueda;

    //Declaración Objetos Decoradores
    private ImageIcon iDimAux;
    public busquedaTemplate(BusquedaComponent barraTituloComponent){

        this.sObjGraficos= ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJLabels();
        this.crearJButtons();
        this.crearBarra();

        this.setSize(900, 50);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradores(){
        new ImageIcon("Clase6/resources/img/logo_app.png");
        new Font("Britannic Bold", Font.PLAIN, 24);
    }
    
    public void crearJButtons(){
    	bBuscar=sObjGraficos.construirJButton(
    			"Q", 310, 10, 30, 30, sRecursos.getcMano(), null, sRecursos.getFontBotones(), sRecursos.getColorAzul(), Color.white, null, "c", true
    			);
    	this.add(bBuscar);

    }

	public void crearJLabels() {
		lUsuario = sObjGraficos.construirJLabel("Usuario", 730, 10, 60, 30, null, new Color(173, 174, 183), Color.white,
				sRecursos.getFontSubtitulo(), "r");
		this.add(lUsuario);

		iDimAux = new ImageIcon(
				sRecursos.getiProfile().getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
		lLogoApp = sObjGraficos.construirJLabel(null, 800, 5, 40, 40, iDimAux, null, null, null, "c");
		this.add(lLogoApp);
		
		iDimAux = new ImageIcon(
				sRecursos.getiMensaje().getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
		lMensajes = sObjGraficos.construirJLabel(null, 670, 10, 30, 30, iDimAux, null, null, null, "c");
		this.add(lMensajes);
		
		iDimAux = new ImageIcon(
				sRecursos.getiCampana().getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
		lNotificacion = sObjGraficos.construirJLabel(null, 630, 10, 30, 30, iDimAux, null, null, null, "c");
		this.add(lNotificacion);

	}
    
    public void crearBarra() {
    	tBusqueda= sObjGraficos.construirJTextField(
    			"Buscar", 10, 10, 300, 30, new Color(248, 249, 252),new Color(196, 198, 205) , 
    			null, sRecursos.getFontTitulo(), null,"x" );
    	this.add(tBusqueda);
    }
    
    
}