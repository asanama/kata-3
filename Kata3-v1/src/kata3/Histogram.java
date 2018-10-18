package kata3;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T>{
    
    private T[] array ;

    public Histogram(T[] array) {
        this.array = array;
    }

    public T[] getArray(){
        return array;
    }
    
    public Map<T,Integer> getMap(){
        Map<T,Integer> count = new HashMap<>();
        for(T i : array){
            count.put(i, (count.containsKey(i)) ? count.get(i)+1: 1);
        }
        return count ;
    }
    
    @Override
    public String toString(){
        String s = "Mapa:\n";
        int i = 0;
        for(Map.Entry<T,Integer> entry : getMap().entrySet()){
            s += entry.getKey() + " --> " + entry.getValue() + "\n";
            i+= entry.getValue();
        }
        s += "Valores: " + i;
        return s;
    }
}