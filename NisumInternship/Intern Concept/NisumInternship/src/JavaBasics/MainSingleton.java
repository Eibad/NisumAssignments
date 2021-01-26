package JavaBasics;

public class MainSingleton {

    public static void main(String[] args) {

        Singleton singleton = Singleton.createInstance();
//        Singleton singleton1 = Singleton.createInstance();
//
//        System.out.println(singleton);
//        System.out.println(singleton1);

        Singleton z =Singleton.createInstance("Singleton Initialize");
        System.out.println(z);

        Singleton zz = Singleton.createInstance();
        System.out.println(zz);

        zz.setValue("Singleton Update only one object");
        System.out.println(z);
        System.out.println(zz);


    }
}
