import java.util.*;

class Std {
    private String name;
    private double gpa;

    public Std(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class AL2 {
    public static void main(String[] ShashwatKumarChoudhary) {
        List<Std> std = new ArrayList<>();
        std.add(new Std("Shashwat", 7.93));
        std.add(new Std("Asad", 9.2));
        std.add(new Std("Piyush", 9.6));
        std.add(new Std("Banku", 9.6));
        std.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }

        });
        System.out.println(" Normal Descending Order:");
        for (Std s : std) {
            System.out.println(s.getName() + ":" + s.getGpa());
        }
        Comparator<Std> cpr = Comparator.comparing(Std::getGpa).reversed().thenComparing(Std::getName);
        // method reference in java8 version :8
        std.sort(cpr);
        System.out.println("Advance Descending Order:");
        for (Std s : std) {
            System.out.println(s.getName() + ":" + s.getGpa());
        }
        Collections.sort(std,cpr);

    }

}
