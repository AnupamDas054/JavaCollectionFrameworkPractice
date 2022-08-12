import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFunctionality {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList();
        studentName.add("Anupam");
        studentName.add("Rakesh");

        for(int i=0;i<studentName.size();i++)
            System.out.println(studentName.get(i));


        List<Integer> myList = new ArrayList();
        myList.add(2);
        myList.add(4);
        myList.add(5);

        System.out.println(myList);
        myList.add(2,50);//add in a specific index
        System.out.println(myList);

        List<Integer>myNewList = new ArrayList();
        myNewList.add(60);
        myNewList.add(70);
        myList.addAll(myNewList);
        System.out.println(myList);

        myList.set(1,10);//set 10 in index 1
        System.out.println(myList);

        myList.remove(1);//remove value of index 1
        System.out.println(myList);

        myList.add(2,50);
        myList.remove(Integer.valueOf(50));//remove 1st index of value 50
        System.out.println(myList);

        System.out.println(myList.contains(50));

        Iterator<Integer> it = myList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}