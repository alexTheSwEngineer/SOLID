package solid.examples.is;

import java.util.*;



/**
 * Created by atrposki on 0017,17 Jul/ 17-7-2017.
 */
public class Example {
    public static void main(String args[]){
        List<Integer> mutableList = Arrays.asList(1,2,3,4);
        List<Integer> immutableList = Collections.unmodifiableList(mutableList);

        goodPrint(new ReadOnlyIterator<>(immutableList.iterator()));
        badPrint(immutableList.iterator());

    }


    private static void badPrint(Iterator<Integer> iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator.remove(); //This will throw an exception;
    }

    private static void goodPrint(ReadOnlyIterator<Integer> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterator.remove();  <-This wouldn't compile
    }

}
