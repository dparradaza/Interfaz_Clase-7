package App.cliente.componentes.tarjeta;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class TarjetaComponent{

    private TarjetaTemplate tarjetaTemplate;

    public TarjetaComponent(
        String titulo, ImageIcon iImagen, String parrafo,Border borde
    ){
        tarjetaTemplate = new TarjetaTemplate(
            this, titulo, iImagen, parrafo,borde
        );
    }

    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetaTemplate;
    }
}
