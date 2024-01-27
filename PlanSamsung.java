package Herencia;
import java.util.ArrayList;

public class PlanSamsung extends Plan{
    private String pin;
    ArrayList<String> samsunglist;
    
    PlanSamsung(int numero,String nombre,String pin){
        super(numero,nombre);
        this.pin = pin;
        samsunglist = new ArrayList<>();
    }
    
    public double PagoMensual(int mins, int msgs){
        double precio = 40;
        if(mins>200)
            precio += (200-mins)*0.8;
        if(msgs>300)
            precio += (300-msgs*0.2);
        return precio;
    }
    
    public String Print(){
        String Pin=super.Imprimir()+"Tipo: Samsung Pin: "+pin;
        return Pin;
    }
    
    public void agregarPinAmigo(String pin){
        int error=0;
        for(int i=0;i<samsunglist.size();i++){
            if(samsunglist.get(i).equals(pin)){
               error=1;
            }
        }
        if(error==0)
            samsunglist.add(pin);
    }
    
    public String getPin(){
        return pin;
    }
}
