package App.cliente.componentes.tarjeta;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class TarjetaComponent{

    private TarjetaTemplate tarjetaTemplate;

    public TarjetaComponent(
        String titulo, ImageIcon iImagen, String parrafo,Border borde , int x, int y
    ){
        tarjetaTemplate = new TarjetaTemplate(
            this, titulo, iImagen, parrafo,borde,x,y
        );
    }

    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetaTemplate;
    }
}
