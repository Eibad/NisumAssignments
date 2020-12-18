package LangPackage.StringLiteralObject;

public class PrimeNumber {

    public static void main(String[] args) {


        int number = 32;
        int count = 0;
        for(int i = 0 ; i<=number; i++){
            if(checkPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("total PRime numbers are : "+ count);
    }


    public static boolean checkPrime(int num){

        int i =2;

        if(num == 1 || num == 0){
            return false;
        }
        while (i <= num/2){


            if(num % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }
}
