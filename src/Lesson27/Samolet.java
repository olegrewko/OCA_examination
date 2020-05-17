package Lesson27;

//public class Test16 {
//    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher [] array2 = {t, t3};
//        Employee [] array1 = {d, t};
//        Teacher t2 = (Teacher)array1[0];

//createPwd("qwe");
//    }
//    public static void createPwd(String pwd) {
//        if (pwd.length() < 6) {
//            throw new IllegalArgumentException("Длина пароля мало");
//        }
//        if (pwd.length() > 12) {
//            throw new IllegalArgumentException("Длина пароля много");
//        }
//        System.out.println("Пароль принят");
//    }
//}
//class Employee{}
//class Doctor extends Employee{}
//class Teacher extends Employee{}
class Samolet {
     int a = 100;
     String as = Integer.toString(a);

    String sostoyanie = "v ojidanii";//
    public void letet() {
        sostoyanie = "v vozduhe";

        System.out.println("Самолет летит");
    }
    public void ojidat() {
        if(sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("Samolet uje v vozduhe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("Самолет в ожидании");
        System.out.println(as);
    }
        public void otmenitPolet() {
            if(sostoyanie.equals("v vozduhe")) {
                throw new IllegalStateException("Samolet uje v vozduhe");
            }
                sostoyanie = "polet otmena";

                System.out.println("Полет самолета отменен");
            }
        public static void main(String[] args) {
            Samolet s = new Samolet();
            s.ojidat();
            s.letet();
//            System.out.println(as);
//            s.otmenitPolet();
        }

}