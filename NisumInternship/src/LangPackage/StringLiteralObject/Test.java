package LangPackage.StringLiteralObject;

public class Test {

    public static void main(String[] args) {

//    Literal =  same object
//        find if object found refer to this

        String qwertyLiteral = "qwerty";
        String qwertyLiteral1 = "qwerty"; //a = b = "qwerty";

        qwertyLiteral1=qwertyLiteral1.concat("ss");
        qwertyLiteral1="qwerty";
        System.out.println("qwertyLiteral==qwertyLiteral1 : "+(qwertyLiteral==qwertyLiteral1));  //pointing towards same object
        System.out.println("qwertyLiteral.equals(qwertyLiteral1) : "+(qwertyLiteral.equals(qwertyLiteral1))); //having same value

        System.out.println("-- BY NEW --");

        String qwerty = new String("qwerty"); //object 1
        String qwerty_ = new String("qwerty"); //object 2

        System.out.println("stringa == qwerty    :  " +(qwerty == qwerty_)); //both reference are change
        System.out.println("qwerty.equals(qwerty_)   : "+(qwerty.equals(qwerty_))); //compare on equal

    }

}
