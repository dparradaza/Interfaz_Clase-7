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
    private JPanel pMision, pVision, pNosotros, pAcciones,pRequests;
    private JLabel lAcciones;

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
        
        this.pAcciones = sObjGraficos.construirJPanel(20, 260, 810, 330, Color.WHITE, null);
        this.add(pAcciones);
        
        
    }

    public void crearObjetosDecoradores(){
        this.iTarjeta1 = new ImageIcon("recursos/pesos.png");
        this.iTarjeta2 = new ImageIcon("recursos/pesos.png");
        this.iTarjeta3 = new ImageIcon("recursos/mensaje.png");
        this.iClase = new ImageIcon("recursos/perfil.png");
        this.iPantalla = new ImageIcon("recursos/perfil.png");
        this.iCelular = new ImageIcon("recursos/perfil.png");
        this.iIdea = new ImageIcon("recursos/perfil.png");
        this.iEstadistica = new ImageIcon("recursos/perfil.png");
        this.iDireccion = new ImageIcon("recursos/perfil.png");
    }

    public void crearContenidoPMision(){
        this.pMision.add(
            new TarjetaComponent(
                "Earnings ", 
                iTarjeta1, 
                "$40.000",
                sRecursos.getBordeizq()
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoPVision(){
        this.pVision.add(
            new TarjetaComponent(
                "Eargs", 
                iTarjeta2, 
                "$215.000",
                sRecursos.getBordeizqVerde()
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoPNosotros(){
        this.pNosotros.add(
            new TarjetaComponent(
                "Tasks", 
                iTarjeta3, 
                "50%",
                sRecursos.getBordeizqNaranja()
            ).getTarjetaTemplate()
        );
    }

    public void crearContenidoReq(){
        this.pRequests.add(
            new TarjetaComponent(
                "Requests", 
                iTarjeta3, 
                "18",
                sRecursos.getBordeizq()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoTask(){
        this.pNosotros.add(
            new TarjetaComponent(
                "Requests", 
                iTarjeta3, 
                "18",
                sRecursos.getBordeizq()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPAcciones(){
        this.lAcciones = sObjGraficos.construirJLabel(
            "Nuestros Servicios", 10, 10, 160, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontTitulo(), "c"
        );
        this.pAcciones.add(lAcciones);

        // COMPONENTE ACCIÓN 1 ------------------------------------
        AccionTemplate p1= new AccionComponent(
            iClase, 
            "Clases", 
            "Clases a la comunidad que complementan el pensum."
        ).getAccionTemplate();
        p1.setLocation(15, 50);
        this.pAcciones.add(p1);

        // COMPONENTE ACCIÓN 2 ------------------------------------
        AccionTemplate p2= new AccionComponent(
            iPantalla, 
            "Clases Virtuales", 
            "Cursos virtuales como medio de enseñanza."
        ).getAccionTemplate();
        p2.setLocation(30 + p2.getWidth(), 50);
        this.pAcciones.add(p2);

        // COMPONENTE ACCIÓN 3 ------------------------------------
        AccionTemplate p3= new AccionComponent(
            iIdea, 
            "Generación de ideas", 
            "Desarrollo de ideas con tecnologías actuales."
        ).getAccionTemplate();
        p3.setLocation(45 + p3.getWidth() * 2, 50);
        this.pAcciones.add(p3);

        // COMPONENTE ACCIÓN 4 ------------------------------------
        AccionTemplate p4= new AccionComponent(
            iCelular, 
            "Notificaciones", 
            "Notificaión el estado de tus cursos y actividades."
        ).getAccionTemplate();
        p4.setLocation(15, 65 + p4.getHeight());
        this.pAcciones.add(p4);

        // COMPONENTE ACCIÓN 5 ------------------------------------
        AccionTemplate p5= new AccionComponent(
            iEstadistica, 
            "Estadisticas", 
            "Gestión de participación en nuestros cursos."
        ).getAccionTemplate();
        p5.setLocation(30 + p5.getWidth(), 65 + p5.getHeight());
        this.pAcciones.add(p5);

        // COMPONENTE ACCIÓN 6 ------------------------------------
        AccionTemplate p6= new AccionComponent(
            iDireccion, 
            "Dirección", 
            "Damos direcciónamiento a nuestros estudiantes."
        ).getAccionTemplate();
        p6.setLocation(45 + p6.getWidth() * 2, 65 + p6.getHeight());
        this.pAcciones.add(p6);
    }
}