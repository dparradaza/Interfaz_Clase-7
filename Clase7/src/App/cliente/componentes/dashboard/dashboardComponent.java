package App.cliente.componentes.dashboard;

public class dashboardComponent {

    private dashboardTemplete dashboardtemplate;

    public dashboardComponent(){
        this.dashboardtemplate=  new dashboardTemplete(this);
    }

    public dashboardTemplete getdashboardTemplate() {
        return this.dashboardtemplate;
    }

}

