package ExceptionHandling;

public class Main  {

    static void checkString(String string){
        if(string == null){
            throw new NullStringException("File not found");
        }


    }
//remake run time exception
    public static void main(String args[]){
      String string = null;

      try{
          checkString(string);
          System.out.println("Exception not occured...");


      }catch (Exception e){
          System.out.println(e);
          System.out.println("Exception occured , Catch Block Executing.....");
      } finally {

          System.out.println("Connection is closing");
      }




        System.out.println("code outside from try/catch block");


    }
}

//    Write a Java program to create a custom exception class that
//    deals with NULL Strings (your custom exception should be thrown if String is NULL)