package App.cliente.VentanaPrincipal;

import java.awt.Color;

/***
 * 
 * @author diego
 *
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

import App.services.ObjGraficoService;
import App.services.RecursosService;

public class VentanaPrincipalTemplate extends JFrame {

    private RecursosService sRecursos;
    private ObjGraficoService sObjGraficos;
    private VentanaPrincipalComponent vistaPrincipalComponent;

    private JPanel pNavegacion, pBarra, pPrincipal;

    public VentanaPrincipalTemplate(VentanaPrincipalComponent vistaPrincipalComponent) {
        super("Vista Principal");

        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficoService.getService();

        this.crearJPanels();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(this);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    public void crearJPanels(){
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 200, 700,sRecursos.getColorAzul(), null);
        this.add(pNavegacion);

        pBarra = sObjGraficos.construirJPanel(200, 0, 900, 50,Color.white, null);
        this.add(pBarra);

        pPrincipal = sObjGraficos.construirJPanel(200, 50, 900, 600, new Color(248, 249, 252), null);
        this.add(pPrincipal);
    }

    public JPanel getPNavegacion() {
        return this.pNavegacion;
    }

    public JPanel getPPrincipal() {
        return this.pPrincipal;
    }

    public JPanel getPBarra() {
        return this.pBarra;
    }
}