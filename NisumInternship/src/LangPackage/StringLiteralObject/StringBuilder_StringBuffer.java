package LangPackage.StringLiteralObject;

public class StringBuilder_StringBuffer {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java is an Object Oriented Language");

        StringBuffer stringBuffer = new StringBuffer("Java is an Object Oriented Language");

        System.out.println("Java is an Object Oriented Language\n");
        long previousTime = System.currentTimeMillis();
        for(int i = 0; i < stringBuilder.length(); i++){
//            System.out.println(stringBuilder.charAt(i));
        }
        System.out.println("Traverse time of String Builder is ="+(System.currentTimeMillis()-previousTime)+" ms");


        previousTime = System.currentTimeMillis();
        for(int i = 0; i < stringBuffer.length(); i++){
//            System.out.println(stringBuffer.charAt(i));
        }
        System.out.println("Traverse time of String Buffer is ="+(System.currentTimeMillis()-previousTime+" ms"));




        //For Checking Speed

        System.out.println("\n=========SPEED=========\n");






        previousTime = System.currentTimeMillis();
        for(int i = 0; i < 99999; i++){
            stringBuffer.append("java java");
        }


        stringBuffer.append('#');
        for(int i = 0; i< stringBuffer.length();i++){
            if(stringBuffer.charAt(i)=='#'){
//                System.out.println(i);
            }
        }

        System.out.println("Traverse + searching time of String Buffer is ="+(System.currentTimeMillis()-previousTime));



        previousTime = System.currentTimeMillis();
        for(int i = 0; i < 99999; i++){
            stringBuilder.append("java java");
        }
        stringBuilder.append('#');

        for(int i = 0; i< stringBuilder.length();i++){
            if(stringBuilder.charAt(i)=='#'){
//                System.out.println(i);
            }
        }
        System.out.println("Traverse + searching time of String Builder is ="+(System.currentTimeMillis()-previousTime));






    }


}
