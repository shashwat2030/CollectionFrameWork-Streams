import java.util.*;

class MapC{
    public static void main(String[] ShashwatKumarChoudhary){
      HashMap<Integer,String> h=new HashMap<>(19,2);
      h.put(1,"Abhishek");
      h.put(2,"Bhartendu");
      h.put(3,"Chandu");
      h.put(4,"Diwakar");
      h.put(5,"Enayat");
      h.put(5,"Mehul"); // replaces the name
     // h.put(null,"Shashwat"); causes null pointer exception
    //  h.put(null,"Vipul");causes null pointer exception
      System.out.println(h);
      String s=h.get(5);  
      System.out.println(s);
      String e=h.get(21);
      System.out.println(e);
      System.out.println(h.containsKey(51));
      System.out.println(h.containsValue("Diwakar"));
      // its just python dictionary i.e. a dictionary of java
        // Now analysing the Key
        Set<Integer> keys=h.keySet();
        for(int k:keys){
          System.out.println(h.get(k));
        }
        System.out.println("Simplified Version");
        for(int k:h.keySet()){
          System.out.println(h.get(k));
        }
        // Set ->Map
      // Since Map is already present in java so name it as Map Class
      System.out.println("SetMapVersion");
      Set<Map.Entry<Integer,String>> entries=h.entrySet();
        for(Map.Entry<Integer,String>entry:entries){
          System.out.println(entry.getKey()+":"+entry.getValue() );
        }
        System.out.println("Uppecase:");
      for(Map.Entry<Integer,String>entry:entries){
        entry.setValue(entry.getValue().toUpperCase()) ;
      } System.out.println(h);
      h.remove(2);
      System.out.println(h);
      boolean r=h.remove(5,"Shashwat");
      System.out.println("Removed ?:"+r);
      List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      l.contains(1);

    }
}