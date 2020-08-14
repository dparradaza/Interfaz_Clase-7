package App.cliente.componentes.accion;

import javax.swing.ImageIcon;

public class AccionComponent {

    private AccionTemplate accionTemplate;

    public AccionComponent(
        ImageIcon imagen, String titulo, String parrafo,int x, int y
    ){
        this.accionTemplate= new AccionTemplate(
            this, imagen, titulo, parrafo , x, y
        );
    }

    public AccionTemplate getAccionTemplate(){
        return accionTemplate;
    }
}

