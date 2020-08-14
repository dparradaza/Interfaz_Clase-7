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
        AccionComponent accionComponent, ImageIcon imagen, String titulo, String parrafo
    ){

        this.sObjGraficos = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();
        this.accionComponent = accionComponent;
        this.accionComponent.getClass();

        iDimAux = new ImageIcon(
            imagen.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING)
        );
        this.lImagen = sObjGraficos.construirJLabel(null, (250-60)/2, 5, 45, 45, iDimAux, null, null, null, "c");
        this.add(lImagen);

        this.lTitulo = sObjGraficos.construirJLabel(
            titulo, (250-220)/2, 50, 220, 30, null, sRecursos.getColorGrisOscuro(), null, sRecursos.getFontTitulo(), "c"
        );
        this.add(lTitulo);

        this.lParrafo = sObjGraficos.construirJLabel(
            "<html><div align='center'>"+parrafo+"</div></html>", (250-230)/2, 75, 230, 50, null, 
            sRecursos.getColorGrisOscuro(), null, sRecursos.getFontSubtitulo(), "c"
        );
        this.add(lParrafo);

        this.setSize(250, 125);
        this.setBackground(Color.WHITE);
        this.setBorder(sRecursos.getBorder());
        this.setLayout(null);
        this.setVisible(true);
    }
}