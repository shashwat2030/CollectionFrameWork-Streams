import java.util.ArrayList;
import java.util.List;

public class Cpe {
    // Cpe stands for Comparable
    public static void exe(){
        List<Std> list=new ArrayList<>();
        list.add(new Std("Asad",9.2));
        list.add(new Std("Rk",9.6));
        list.add(new Std("Sabi",9.7));
        list.add(new Std("Shashwat",7.9));
        list.sort(null);
        System.out.println(list);
        // Integers list
        List<Integer> list2=new ArrayList<>();
        list2.add(1);list2.add(2);list2.add(99);
        list2.sort(null);
        System.out.println(list2);


    }
    public static void main(String[]ShashwatKumarChoudhary){exe();}
}
class Std implements Comparable<Std>{
    private String name;
    private double gpa;
    public Std(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public String getName(){return name;}
    public double getGpa(){return gpa;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    @Override
    public int compareTo(Std o) {
        return Double.compare(o.gpa,this.gpa);
    }
}
