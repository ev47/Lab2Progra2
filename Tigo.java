package Herencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class Tigo {
    
    static private ArrayList<PlanSamsung> ListaSamsung = new ArrayList();
    static private ArrayList<Planiphone> ListaIphone = new ArrayList();
    
    public void agregarPlan(int numerotal, String nombre, String extra, String tipo){
        if(busqueda(numerotal,extra,tipo,0)==false){
        if (tipo.equals("Samsung")){
            ListaSamsung.add(new PlanSamsung(numerotal,nombre,extra));
          JOptionPane.showMessageDialog(null,"Usuario agregado al Plan Samsung");
        } else if (tipo.equals("iPhone")){
            ListaIphone.add(new Planiphone(numerotal,nombre, extra));
        JOptionPane.showMessageDialog(null,"Usuario agregado al Plan iPhone");
        }
        }else{
           JOptionPane.showMessageDialog(null,"Este numero ya ha sido registrado");
        }
    }
    
    public boolean busqueda(int numero, String extra, String tipo, int j){
        if (tipo.equalsIgnoreCase("Samsung")){
            if(j<ListaSamsung.size()){
                if(numero==ListaSamsung.get(j).getNumero() || extra.equals(ListaSamsung.get(j).getPin())){
                    return true;
                }
                return busqueda(numero,extra,tipo,j-1);
            }
        } else if (tipo.equalsIgnoreCase("iPhone")){
            if(j<ListaIphone.size()){
                if(numero==ListaIphone.get(j).getNumero() || extra.equals(ListaIphone.get(j).getEmail())){
                    return true;
                }
                return busqueda(numero,extra,tipo,j-1);
            }
        }
        return false;
    }
    
    public PlanSamsung buscar_numero(int numeroTel, String extra){
        String tipo="Samsung";
        if(busqueda(numeroTel,extra,tipo,0)==true){
            for(int i=0; i<ListaSamsung.size();i++){
                if (numeroTel==ListaSamsung.get(i).getNumero()){
                    return ListaSamsung.get(i);
                }
            }
        }
        return null;
    }
    
    public double pago_plan(int numero,int mins,int msjs ){
        for (int i=0;i<ListaSamsung.size();i++){
            if(numero==ListaSamsung.get(i).getNumero()){
                return ListaSamsung.get(i).PagoMensual(mins, msjs);
            }
        }
        
        for (int i=0;i<ListaIphone.size();i++){
            if(numero==ListaIphone.get(i).getNumero()){
                return ListaIphone.get(i).PagoMensual(mins, msjs);
            }
        }
        
        return 0;
    }
    
    public void agregarAmigo(int numeroTel, String pin){
        if (buscar_numero(numeroTel,pin)!=null){
            buscar_numero(numeroTel,pin).agregarPinAmigo(pin);
        } else
            System.out.println("mal");
    }
    
    public String listar(){
            String listado="\n";
            
            for (int i = 0; i < ListaSamsung.size(); i++) {
                listado=listado+ListaSamsung.get(i).Imprimir();
            }
            
            for(int i=0;i<ListaIphone.size();i++){
                listado=listado+ListaIphone.get(i).Imprimir();
            }
            return listado;
    }
    
}
