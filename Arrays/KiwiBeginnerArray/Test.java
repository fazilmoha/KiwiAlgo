package KiwiAlgo.Arrays.KiwiBeginnerArray;

/**
 * Manual testing class for develeopment purposes.
 * 
 * @author mdfazil
 * 
 */
public class Test {
    public static void main(String[] args){
        KiwiBeginnerArray<String> array = new KiwiBeginnerArray<>();
        array.add("Fazil");
        array.add("shaziya");
        array.add("shahira");
        array.add("fakrudeen");

        System.out.println(array.get(0));
        array.remove("Fazil");
        System.out.println(array.get(0));
        array.removeAt(0);
        System.out.println(array.get(0));


    }
}
