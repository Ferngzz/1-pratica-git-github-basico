import java.util.ArrayList;
import java.util.List;
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

        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);

        System.out.println("l2: " + l2);
        System.out.println("Union: " + union(l1,l2));

    }
}