import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EMap {
    public static void exe(){
        // array is same as enum
        // no hashing
        // ordinal/index is used
         Map<Company,String> map=new HashMap<>();
         Map<Company,String> emap=new EnumMap<>(Company.class);
         emap.put(Company.Apple,"Unique");
         emap.put(Company.Google,"Dream");
         emap.put(Company.Microsoft,"Common");
         emap.put(Company.Meta,"Chill");
         emap.put(Company.Amazon,"Business");
         emap.put(Company.Samsung,"SouthKorea");
         emap.put(Company.Adobe,"Photoshop");
         emap.put(Company.Cisco,"Networking");
         emap.put(Company.Netflix,"BingeWatch");
         emap.put(Company.Tata,"RatanTata");
         System.out.println(Company.Google.ordinal());
         System.out.println(emap);
         String s=emap.get(Company.Google);
         System.out.println(s);



    }
    public static void main(String[]ShashwatKumarChoudhary){exe();}
}
enum Company{
    Apple, Google,Microsoft ,Meta,Amazon,Samsung,Adobe,Cisco,Netflix,Tata
}