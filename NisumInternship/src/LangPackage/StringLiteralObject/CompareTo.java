package LangPackage.StringLiteralObject;

public class CompareTo {

    public static void main(String[] args) {
        String qwerty = "qwerty";
        String qwerty_ = "qwerty";
        String qwert = "werty";

        //Compare on ASCII code base
        System.out.println(qwerty.compareTo(qwerty_));
        System.out.println(qwerty.compareTo(qwert));
        System.out.println(qwert.compareTo(qwerty));


    }
}
