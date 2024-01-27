package Herencia;

public class Planiphone extends Plan{

    private String email;

    public Planiphone(int telefono, String nombre, String correo) {
        super(telefono, nombre);
        this.email =correo;
    }

    
    public double PagoMensual(int mins, int msgs){
        double total = 22+(0.4 * mins) +(0.1*msgs);
        return total;
    }
    
    public String Imprmir(){
        String correo=super.Imprimir()+"Tipo: iphone Email: "+email;
        return correo;
    }
    
    public String getEmail(){
        return email;
    }
    
    
}
