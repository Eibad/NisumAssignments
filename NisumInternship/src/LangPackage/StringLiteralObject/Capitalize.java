package LangPackage.StringLiteralObject;

public class Capitalize {
    public static void main(String[] args) {

        String phrase = "my name is Eibad";

        StringBuffer stringBuffer = new StringBuffer("my name is Eibad");

        StringBuffer stringBuffer2 = new StringBuffer("my name is Eibad");
        String result ="";
        int i = 0;


        while(i < phrase.length()){
            if(stringBuffer.charAt(i)==' ' || i==0){
                if(stringBuffer.charAt(i+1) >97 && stringBuffer.charAt(i+1) <122){
//                    phrase.charAt(i+1) = (char)(phrase.charAt(i+1)-32);
                    stringBuffer.setCharAt(i+1,(char)(stringBuffer.charAt(i+1)-32));;
                }
            }
            i++;
        }



        result = result + (char)(phrase.charAt(0)+1);
        System.out.println((phrase.charAt(0)+1));
        System.out.println(phrase.toUpperCase());
        System.out.println(result);
        System.out.println("OUTPUT");
        System.out.println(stringBuffer);
    }
}
