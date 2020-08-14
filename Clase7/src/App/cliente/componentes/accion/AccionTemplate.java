package App.cliente.componentes.accion;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import App.services.ObjGraficoService;
import App.services.RecursosService;


public class AccionTemplate extends JPanel {


    // Declaración de servicios y objetos
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private AccionComponent accionComponent;

    // Declaración Objetos Gráficos
    private JLabel lImagen, lTitulo, lParrafo;

    // Declaración Objetos Decoradores
    private ImageIcon iDimAux;

    public AccionTemplate(
        AccionComponent accionComponent, ImageIcon imagen, String titulo, String parrafo,int x,int y
    ){

        this.sObjGraficos = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();
        this.accionComponent = accionComponent;
        this.accionComponent.getClass();

        iDimAux = new ImageIcon(
            imagen.getImage().getScaledInstance(x, y, Image.SCALE_AREA_AVERAGING)
        );
        this.lImagen = sObjGraficos.construirJLabel(null, 20, 5,x, y, iDimAux, null, null, null, "c");
        this.add(lImagen);

        
        this.setSize(x, y);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setVisible(true);
    }
}