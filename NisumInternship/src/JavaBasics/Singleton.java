package JavaBasics;

public class Singleton {

    private static Singleton singletonInstance;

    private String value;

    private Singleton() {
        value = "default construtor";
    }

    private Singleton(String value) {
        this.value = value;
    }

    public static  Singleton createInstance(){


        if(singletonInstance == null){
            synchronized (Singleton.class){
            singletonInstance = new Singleton();
        }
//            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public static Singleton createInstance(String value){
        if(singletonInstance == null){
            synchronized (Singleton.class){
             singletonInstance = new Singleton(value);
        }}
        return singletonInstance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value='" + value + '\'' +
                '}';
    }
}
