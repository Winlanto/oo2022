import java.util.*;
public class List1 {
    public static void main(String[] args){
        List<String> eesnimed=new ArrayList<String>();
        eesnimed.add("Juku");
        eesnimed.add("Kati");
        eesnimed.add("Alek");
        System.out.println(eesnimed.get(1));
        System.out.println(eesnimed.size());
        for(String eesnimi: eesnimed){
            System.out.println(eesnimi);
        }
    }
}