package JavaBasics;

public class MainSingleton {

    public static void main(String[] args) {

        Singleton singleton = Singleton.createInstance();
        Singleton singleton1 = Singleton.createInstance();

        Singleton singletonInitialize =Singleton.createInstance("Singleton Initialize");
        System.out.println(singletonInitialize);

        System.out.println("HashCode of singleton "+singleton.hashCode());
        Singleton singleton2 = Singleton.createInstance();
        System.out.println(singleton2);

        singleton2.setValue("Singleton Update only one object");
        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println("singleton==singleton1 : "+(singleton==singleton1));

        System.out.println("HashCode of singleton  "+singleton.hashCode());
        System.out.println("HashCode of singleton1 "+singleton1.hashCode());

    }
}
//only one object for all
