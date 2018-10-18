package kata3;
import gui.*;

public class Kata3 {

    public static void main(String[] args) {
        String[] data = {"Aarón", "Alejandro", "Gabriel", "Alejandro",
        "Aaron","Alejandro","Gabriel","Alberto","Aaron","Alejandro"};
        
        Histogram his = new Histogram(data);
        HistogramDisplay p = new HistogramDisplay("Alejandro",his,"Nombres",
        "Cantidad");
        p.execute();
        
        
        
    }
    
}
