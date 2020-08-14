package App.cliente.componentes.navegacion;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import App.services.ObjGraficoService;
import App.services.RecursosService;

public class NavegacionTemplate extends JPanel{

	//Declaración Servicios y dependencias
    private navegacionComponent navegacionUsuarioComponent;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;

    //Declaración objetos gráficos
    private JPanel pSuperior, pInferior;
    private JLabel lNombreUsuario, lEslogan, lImagenUsuario, lIconoUsuario, separador;
    private JButton bDashboard, bComponents, bAmigos, bCharts, bConfiguracion, bCerrarSesion;

    //Declaración Objetos Decoradores
    private ImageIcon iIconoUsuario, iInicio, iComponents, iPages, iCharts, 
    iConfiguracion, iCerrarSesion, iImagenUsuario, iDimAux;

    public NavegacionTemplate(navegacionComponent navegacionUsuarioComponent){
        this.navegacionUsuarioComponent = navegacionUsuarioComponent;
        this.sObjGraficos= ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJLabels();
        this.crearJButtons();

        this.setSize(250, 700);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanels(){

        this.pSuperior = sObjGraficos.construirJPanel(
            0, 0, 250, 80, sRecursos.getColorAzul(), null
        );
        this.add(pSuperior);

        this.pInferior = sObjGraficos.construirJPanel(
            0, 80, 650, 620, sRecursos.getColorAzul(), null
        );
        this.add(pInferior);
    }

    public void crearObjetosDecoradores(){

        this.iIconoUsuario = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/emoji.png");
        this.iInicio = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/dash.png");
        this.iComponents = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/llve.png");
        this.iPages = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/pages.png");
        this.iCharts = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/chart.png");
        this.iConfiguracion = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/utiliti.png");
        this.iImagenUsuario = new ImageIcon("/home/diego/git/Interfaz_Clase-6/Clase6/recursos/perfil.png");
    }

    public void crearJButtons(){

        
        iDimAux = new ImageIcon(
            iInicio.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bDashboard = sObjGraficos.construirJButton(
            "  Dashboard      ", 30, 0, 200, 40, sRecursos.getcMano(), 
            iDimAux, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bDashboard.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bDashboard);


        iDimAux = new ImageIcon(
            iComponents.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bComponents = sObjGraficos.construirJButton(
            "  Components               >", 30, 50, 200, 40, sRecursos.getcMano(), 
            iDimAux, sRecursos.getFontTitulo(), null, Color.WHITE, null, "l", false
        );
        this.bComponents.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bComponents);

        iDimAux = new ImageIcon(
            iPages.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bAmigos = sObjGraficos.construirJButton(
            "  Pages                          >", 30, 100, 200, 40, sRecursos.getcMano(), 
            iDimAux, sRecursos.getFontTitulo(), null, Color.WHITE, null, "l", false
        );
        this.bAmigos.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bAmigos);


        iDimAux = new ImageIcon(
            iCharts.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bCharts = sObjGraficos.construirJButton(
            "  Charts                          >", 30, 150, 200, 40, sRecursos.getcMano(), 
            iDimAux, sRecursos.getFontTitulo(), null, Color.WHITE, null, "l", false
        );
        this.bCharts.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bCharts);


        iDimAux = new ImageIcon(
            iConfiguracion.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bConfiguracion = sObjGraficos.construirJButton(
            "  Tables                          >", 30, 200, 200, 40, sRecursos.getcMano(), 
            iDimAux, sRecursos.getFontTitulo(), null, Color.WHITE, null, "l", false
        );
        this.bConfiguracion.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bConfiguracion);



        this.bCerrarSesion = sObjGraficos.construirJButton(
            "               <       ", 30, 250, 200, 40, sRecursos.getcMano(), 
            null, sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false
        );
        this.bCerrarSesion.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bCerrarSesion);
    }

    public void crearJLabels(){


        iDimAux = new ImageIcon(
            iIconoUsuario.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        );
        this.lIconoUsuario = sObjGraficos.construirJLabel(
            null, 20, 20, 40, 40, iDimAux, null, null, null, "c"
        );
        this.pSuperior.add(lIconoUsuario);


        this.lNombreUsuario = sObjGraficos.construirJLabel(
            "SB ADMIN", 20, 20, 200, 40, null, Color.WHITE, null, sRecursos.getFontBotones(), "c"
        );
        this.pSuperior.add(lNombreUsuario);
        
		this.separador = sObjGraficos.construirJLabel("__________________________", 20, 40, 200, 40, null, Color.WHITE, null,
				sRecursos.getFontSubtitulo(), "c");
		this.pSuperior.add(separador);
		
		this.separador = sObjGraficos.construirJLabel("__________________________", 20, 20, 200, 40, null, Color.WHITE, null,
				sRecursos.getFontSubtitulo(), "c");
		this.pInferior.add(separador);
		
		this.separador = sObjGraficos.construirJLabel("__________________________", 20, 220, 200, 40, null, Color.WHITE, null,
				sRecursos.getFontSubtitulo(), "c");
		this.pInferior.add(separador);

	}
}