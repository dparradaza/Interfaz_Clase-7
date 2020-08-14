package App.cliente.componentes.dashboard;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import App.cliente.componentes.accion.AccionComponent;
import App.cliente.componentes.accion.AccionTemplate;
import App.cliente.componentes.tarjeta.TarjetaComponent;
import App.services.ObjGraficoService;
import App.services.RecursosService;

public class dashboardTemplete extends JPanel{
    
    // Declaración Servicios y dependencias
    private dashboardComponent dashboardComponent;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos; 

    // Declaración Objetos Gráficos 
    private JPanel pMision, pVision, pNosotros, pAcciones,pRequests,pCharts,pProject,pIlustracion;
    private JLabel lAcciones,lService;

    // Declaración Objetos Decoradores
    private ImageIcon iTarjeta1, iTarjeta2, iTarjeta3;
    private ImageIcon iClase, iPantalla, iIdea, iCelular, iEstadistica, iDireccion; 
    
    public dashboardTemplete(dashboardComponent dashboardComponent){
        this.dashboardComponent = dashboardComponent;
        this.dashboardComponent.getClass();
        sObjGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearContenidoPMision();
        this.crearContenidoPVision();
        this.crearContenidoPNosotros();
        this.crearContenidoTask();
        this.crearContenidoPAcciones();
        this.crearContenidoReq();
        this.crearContenidopanelchart();
        this.crearContenidoproject();
        this.crearContenidoilustracion();
        
        
        this.setSize(900, 600);
        this.setBackground(new Color(242, 243, 246));
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanels(){
        this.pMision = sObjGraficos.construirJPanel(20, 15, 200, 90, Color.WHITE, sRecursos.getBordeizq());
        this.add(pMision);

        this.pVision = sObjGraficos.construirJPanel(230, 15, 200, 90, Color.WHITE, null);
        this.pVision.setBorder(sRecursos.getBordeizqVerde());
        this.add(pVision);
        
        this.pNosotros = sObjGraficos.construirJPanel(440, 15, 200, 90, Color.WHITE, null);
        this.add(pNosotros);

        this.pRequests= sObjGraficos.construirJPanel(650, 15, 200, 90, Color.WHITE, null);
        this.add(pRequests);
        
        this.pAcciones = sObjGraficos.construirJPanel(20, 130, 500, 280, Color.WHITE, null);
        this.add(pAcciones);
        
        this.pCharts= sObjGraficos.construirJPanel(540, 130, 300, 280, Color.WHITE, null);
        this.add(pCharts);
       
        this.pProject= sObjGraficos.construirJPanel(20, 430, 400, 150, Color.WHITE, null);
        this.add(pProject);
       
        this.pIlustracion= sObjGraficos.construirJPanel(450, 430, 400, 150, Color.WHITE, null);
        this.add(pIlustracion);
        
        
        
    }

    public void crearObjetosDecoradores(){
        this.iTarjeta1 = new ImageIcon("recursos/pesos.png");
        this.iTarjeta2 = new ImageIcon("recursos/pesos.png");
        this.iTarjeta3 = new ImageIcon("recursos/mensaje.png");
        this.iClase = new ImageIcon("recursos/grafica.png");
        this.iPantalla = new ImageIcon("recursos/grafica2.png");
        this.iCelular = new ImageIcon("recursos/grafica3.png");
        this.iIdea = new ImageIcon("recursos/grafica4.png");
        this.iEstadistica = new ImageIcon("recursos/perfil.png");
        this.iDireccion = new ImageIcon("recursos/perfil.png");
    }

    public void crearContenidoPMision(){
        this.pMision.add(
            new TarjetaComponent(
                "Earnings ", 
                iTarjeta1, 
                "$40.000",
                sRecursos.getBordeizq(),
                30,30
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoPVision(){
        this.pVision.add(
            new TarjetaComponent(
                "Eargs", 
                iTarjeta2, 
                "$215.000",
                sRecursos.getBordeizqVerde(),
                30,30
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoPNosotros(){
        this.pNosotros.add(
            new TarjetaComponent(
                "Tasks", 
                iTarjeta3, 
                "50%",
                sRecursos.getBordeizqNaranja(),
                30,30
               
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoReq(){
        this.pRequests.add(
            new TarjetaComponent(
                "Requests", 
                iTarjeta3, 
                "18",
                sRecursos.getBordeizq(),
                30,30
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoTask(){
        this.pNosotros.add(
            new TarjetaComponent(
                "Requests", 
                iTarjeta3, 
                "18",
                sRecursos.getBordeizq(),
                30,30
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPAcciones(){
        this.lAcciones = sObjGraficos.construirJLabel(
            "Earnings Overview", 10, 10, 160, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontBotones(), "c"
        );
        this.pAcciones.add(lAcciones);

        AccionTemplate p1= new AccionComponent(
            iClase, 
            "", 
            "",
            400,240
        ).getAccionTemplate();
        p1.setLocation(10, 20);
        this.pAcciones.add(p1);
      
        
    }
    
    public void crearContenidopanelchart() {
        this.lService = sObjGraficos.construirJLabel(
                "Revenue Sources", 10, 10, 160, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontBotones(), "c"
            );
            this.pCharts.add(lService);

            AccionTemplate p2= new AccionComponent(
            		iPantalla, 
                "", 
                "",
                200,220
            ).getAccionTemplate();
            p2.setLocation(10, 20);
            this.pCharts.add(p2);
    }
    
    public void crearContenidoproject() {
        this.lService = sObjGraficos.construirJLabel(
                "Projects", 10, 10, 160, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontBotones(), "c"
            );
            this.pProject.add(lService);

            AccionTemplate p2= new AccionComponent(
            		iIdea, 
                "", 
                "",
                320,100
            ).getAccionTemplate();
            p2.setLocation(10, 30);
            this.pProject.add(p2);
    	
    }
    
    public void crearContenidoilustracion() {
    	 this.lService = sObjGraficos.construirJLabel(
                 "Ilustrations", 10, 10, 160, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontBotones(), "c"
             );
             this.pIlustracion.add(lService);

             AccionTemplate p2= new AccionComponent(
             		iCelular, 
                 "", 
                 "",
                 300,100
             ).getAccionTemplate();
             p2.setLocation(10, 30);
             this.pIlustracion.add(p2);
    }
    
}