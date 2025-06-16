import java.lang.ref.WeakReference;

public class GC {
    public static void exe(){
        Phone p=new Phone("Apple","SE");
        Phone np=new Phone("Micromax","Bolt");
        //strong reference
        System.out.println(p);
        p=null;
        System.out.println(p);
        // weak reference
        WeakReference<Phone> wp=new WeakReference<>(new Phone("Apple","SE"));
        System.out.println(wp.get());
        System.gc();//suggest jvm about garbage collection ->null
        try{
            Thread.sleep(10000);
        }
        catch(Exception ignored){}
        System.out.println(wp.get());
    }
    public static void main(String[] ShaswatKumarChoudhary){exe();}
}
class Phone{
    String brand,model;
    public Phone(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
