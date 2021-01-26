package LangPackage.StringLiteralObject;

public class Test {

    public static void main(String[] args) {

//    Literal =  same object
//        find if object found refer to this

        String a = "qwerty";
        String b = "qwerty"; //a = b = "qwerty";

        System.out.println(a==b);  //pointing towards same object
        System.out.println(a.equals(b)); //having same value

        String stringa = new String("qwerty"); //object 1
        String stringb = new String("qwerty"); //object 2

        System.out.println(stringa == stringb); //both reference are change
        System.out.println(stringa.equals(stringb)); //compare on equal

    }

}
