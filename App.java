import java.util.ArrayList;
import java.util.List;

public class App {

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





    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
