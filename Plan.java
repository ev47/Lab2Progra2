package Herencia;

public abstract class Plan {
    
    protected int numero;
    protected String nombre;
    
    public Plan(int numero, String nombre){
        this.numero=numero;
        this.nombre=nombre;
    }
    
    public abstract double PagoMensual(int mins, int msjs);
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String Imprimir(){
        String info="Nombre: "+nombre+   "\nNúmero: "+numero;
        return info;
    }
    
}
