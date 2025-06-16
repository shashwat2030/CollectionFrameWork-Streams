import java.util.Map;
import java.util.WeakHashMap;

public class WeakHasMap {
    public static void exe(){
        WeakHashMap<String,Img> imgcach=new WeakHashMap<>();
        loadCache(imgcach);
        System.out.println(imgcach);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Clear_Cache:"+imgcach);
    }
    public static void loadCache(Map<String,Img> imgcach){
        String key1=new String("img1");
        String key2=new String("img2");
        imgcach.put(key1,new Img("Image1"));
        imgcach.put(key2,new Img("Image2"));
    }
    public static void simulateApplicationRunning(){
        System.out.println("Simulate Application Running");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){e.printStackTrace();}
    }
    public static void main(String[] ShashwatKumarChoudhary){exe();}
}
class Img{
    private String name;
    public Img(String name){this.name=name;}
    @Override
    public String toString() {
        return name;
    }
}