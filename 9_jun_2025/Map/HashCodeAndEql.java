import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEql {
    public static void exe(){
        HashMap<Student,String> sm=new HashMap<>();
        Student s1=new Student("Shashwat",51);
        Student s2=new Student("Rahul",50);
        Student s3=new Student("Shashwat",51);
        sm.put(s1,"Engineer");//hashcode1->index1
        sm.put(s2,"Teacher");//hashcode2->index2
        sm.put(s3,"IAS");//hashcode1->index1->equals()-replace
        System.out.println("Size:"+sm.size());
        System.out.println("S1 Value:"+sm.get(s1));
        System.out.println("S3 Value:"+sm.get(s3));
        System.out.println(s1);
        // new keyword creates new object i.e. creating a separate has map
        Map<String ,Integer> nm=new HashMap<>();
        nm.put("Shashwat",99);// hashcode1->index1
        nm.put("Rahul",98);//hashcode2->index2
        nm.put("Shashwat",100);//hashcode1-> index1->equals()-replace


    }
    public static void main (String[] ShashwatKumarChoudhary){
        exe();
    }
}
class Student{
    private String name;
    private int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){return name;}
    public int getId(){return id;}
    @Override
    public int hashCode() {return Objects.hash(name,id);}
    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(o==null){return false;}
        if(getClass()!=o.getClass()){return false;}
        Student os=(Student)o; //os ->other student
        return id==os.getId() && Objects.equals(name,os.getName());
    }
    @Override
    public String toString(){return "id:"+id+", name:"+name;}
}
