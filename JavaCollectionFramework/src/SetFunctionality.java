import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetFunctionality {

    public  static  void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();// order is not maintained
       // Set<Integer> set = new LinkedHashSet<>();//order is maintained according to insert
        set.add(5);
        set.add(1);
        set.add(34);
        set.add(12);
        System.out.println(set.size());
        System.out.println(set.contains(12));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(23));
        //set.clear();

    }

}

