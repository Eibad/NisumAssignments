package Z_Extra;

public class ContractsEqual {
    public static void main(String[] args) {

        Employee eibad = new Employee(1,"Eibad","12",2000);
        Employee ali = new Employee(1,"Eibad","12",2000);

        System.out.println("eibad == ali :"+(eibad == ali));
        System.out.println("eibad.equals(ali) :"+eibad.equals(ali)); //FALSE without overriding

        System.out.println("---AFTER OVERRIDING---");
        System.out.println("eibad == ali :"+(eibad == ali));
        System.out.println("eibad.equals(ali) :"+eibad.equalsCustom(ali)); //TRUE after overriding


        System.out.println("eibad.hashCode() :"+eibad.hashCode());
        System.out.println("ali.hashCode() :"+ali.hashCode());
    }
}
