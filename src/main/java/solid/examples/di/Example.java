package solid.examples.di;

/**
 * Created by atrposki on 0019,19 Jul/ 19-7-2017.
 */
public class Example {
    public static void main(String args[]){
        BadPrinter badPrinter = new BadPrinter();
        badPrinter.print(null);
        GoodPrinter goodPrinter = new GoodPrinter(System.out);
        goodPrinter.print(null);
    }
}
