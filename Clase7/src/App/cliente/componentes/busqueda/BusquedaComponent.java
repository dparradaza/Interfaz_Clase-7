package App.cliente.componentes.busqueda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusquedaComponent implements ActionListener{

    private busquedaTemplate barraTituloTemplate;

    public BusquedaComponent(){
        this.barraTituloTemplate= new busquedaTemplate (this);
    }



    public busquedaTemplate getBarraTituloTemplate() {
        return this.barraTituloTemplate;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("menu");
		
	}
}