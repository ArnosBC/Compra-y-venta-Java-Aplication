package ventavehiculo1;

import GUI.Login;
import GUI.Venta_Vehiculo;

public class VentaVehiculo1 implements Login.LoginListener{

    private Login loginForm;
    private Venta_Vehiculo ventaForm;
    
    public VentaVehiculo1(){
        loginForm = new Login();
        loginForm.addLoginListener(this);

        ventaForm = new Venta_Vehiculo();
    }
    public void start() {
        loginForm.setVisible(true);
    }
    @Override
    public void onLoginSuccess() {
        loginForm.setVisible(false);

        ventaForm.setVisible(true);
    }
    
    public static void main(String[] args) {
        VentaVehiculo1 app = new VentaVehiculo1();
        app.start();
    }
    
}
