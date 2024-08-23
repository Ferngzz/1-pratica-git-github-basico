import java.util.ArrayList;
import java.util.List;
public class Main {

    public static List<Integer> union(List<Integer> l1, List<Integer> l2){

        List<Integer> unionList = new ArrayList<>(l1);

        for (int i : unionList){
            if(!unionList.contains(l2.get(i))){
                unionList.add(i);
            }
        }

        return unionList;
    }


    public static void main(String[] args) {
    }
}