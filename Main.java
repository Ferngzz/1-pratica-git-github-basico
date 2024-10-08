import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Integer> union(List<Integer> l1, List<Integer> l2){

        List<Integer> unionList = new ArrayList<>();

        for (Integer i : l1) {
            if (!unionList.contains(i)) {
                unionList.add(i);
            }
        }
        for (Integer i : l2) {
            if (!unionList.contains(i)) {
                unionList.add(i);
            }
        }

        return unionList;
    }

    public static List<Integer> intersect(List<Integer> l1, List<Integer> l2){
        List<Integer> intersectList = new ArrayList<>();

        for (Integer i : l1) {
            for (Integer j : l2) {
                if (i.equals(j) && !intersectList.contains(i)) {
                    intersectList.add(i);
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

    public List<Integer> listaElementosRepetidos(ArrayList<Integer> l){
        List<Integer> elementosRepetidos = new ArrayList<>();

        for(int i = 0 ; i < elementosRepetidos.size() ; i++){
            for(int j = i + 1 ; j < elementosRepetidos.size() ; j++ ) {
                if( i == j) {
                    elementosRepetidos.add(l.get(i));
                }
            }
        }

        return elementosRepetidos;
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        ArrayList<Integer> array1 = new ArrayList<Integer>();

        Random geraNumeros = new Random();

        int rangeRandom = 30;

        for(int i = 0 ; i < 10; i++){
            int numeroAleatorio = geraNumeros.nextInt(rangeRandom);
            l1.add(numeroAleatorio);
            array1.add(numeroAleatorio);
        }

        System.out.println("l1: " + l1);

        for(int i = 0 ; i < 10; i++){
            int numeroAleatorio = geraNumeros.nextInt(rangeRandom);
            l2.add(numeroAleatorio);
        }

        System.out.println("l2: " + l2);
        System.out.println("Union: " + union(l1,l2));
        System.out.println("Intersect: " + intersect(l1,l2));

        int numeroProcurar = 5;
        System.out.println("Ocorrencias do numero " + numeroProcurar + " na lista = " + nOcorrencias(array1,numeroProcurar));

        System.out.println("Array1 possui numeros repetidos = " + hasRepeat(array1));
    }
}