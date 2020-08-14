package App.cliente.componentes.tarjeta;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import App.services.ObjGraficoService;
import App.services.RecursosService;

public class TarjetaTemplate extends JPanel{



    // Declaración Servicios y dependencias
    private TarjetaComponent tarjetaComponent;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración Objetos Gráficos
    private JLabel lTitulo, lImagen, lParrafo;

    // Declaración Objetos Decoradores
    private ImageIcon iDimAux;

    public TarjetaTemplate(
        TarjetaComponent tarjetaComponent, String titulo, ImageIcon iImagen, String parrafo, Border borde
    ){

        this.tarjetaComponent = tarjetaComponent;
        this.tarjetaComponent.getClass();
        sObjGraficos= ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        iDimAux = new ImageIcon(
            iImagen.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        lImagen= sObjGraficos.construirJLabel(null, 150, 20, 30, 30, iDimAux, null, null, null, "x");
        this.add(lImagen);

        this.lTitulo = sObjGraficos.construirJLabel(
            titulo, 20, 10, 150, 30, null, sRecursos.getColorAzul(), null, sRecursos.getFontBotones(), "x"
        );
        this.add(lTitulo);

        lParrafo= sObjGraficos.construirJLabel(
            parrafo, 20, 15, 150, 60, null, sRecursos.getColorGrisOscuro(), null, sRecursos.getFontBotones(), "x"
        );
        this.add(lParrafo);
        
        this.setBorder(borde);
        this.setSize(230, 130);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    }
}