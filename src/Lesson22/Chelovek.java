package Lesson22;

public class Chelovek {
    final String pol;
    Chelovek(String pol) {
        this.pol = pol;
    }
    private String name;
    private int vozrast;
    private int v;
    public String getName() {
        return name;
    }

    public void setName(String s) {
       name = s;
    }

    public void setVozrast(int i) {
        if (i>0) {
           vozrast = i;
        }
    }



    public int getV() {
        return v;
    }

    public void setV(int i) {
        if(i>0) {
            v = i;
        }
    }

    private int ves;
}
class TestChelovek {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolia");
        c.setV(50);
        c.setVozrast(65);
        System.out.println(c.getName());
        System.out.println(c.getV());



    }
}
