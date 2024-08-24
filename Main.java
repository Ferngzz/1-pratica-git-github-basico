import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Integer> union(List<Integer> l1, List<Integer> l2){

        List<Integer> unionList = new ArrayList<>(l1);

        for (int i = 0; i < l2.size(); i++){
            if(!unionList.contains(l2.get(i))){
                unionList.add(l2.get(i));
            }
        }

        return unionList;
    }

    public static List<Integer> intersect(List<Integer> l1, List<Integer> l2){
        List<Integer> intersectList = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))){
                    intersectList.add(l1.get(i));
                    break;
                }
            }
        }

        return intersectList;
    }

    public static int nOcorrencias(ArrayList<Integer> l, Integer el){
        int ocorrencias = 0 ;
        for( Integer element : l ){
            if(element == el){
                ocorrencias++;
            }
        }

        return ocorrencias;
    }

    public static boolean hasRepeat(ArrayList< Integer > l){
        for(int i = 0; i < l.size() ; i++){
            for(int j = i + 1 ; j < l.size() ; j++)
                if(l.get(i) == l.get(j))
                    return true;
        }
        return false;
    }

    public int nroRepeat(){
        List<Integer> elementosRepetidos = new ArrayList<>();
        int cont = 0;

        for(int i = 0 ; i < elementosRepetidos.size() ; i++){
            for(int j = i + 1 ; j < elementosRepetidos.size() ; j++ ) {
                if( i == j) {
                    cont++;
                }
            }
        }

        return cont;   
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        System.out.println("l1: " + l1);

        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);

        System.out.println("l2: " + l2);
        System.out.println("Union: " + union(l1,l2));
        System.out.println("Intersect: " + intersect(l1,l2));

    }
}