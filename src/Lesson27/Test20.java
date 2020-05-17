package Lesson27;

public class Test20 {
    static String str = "";
    void ghi() throws Exception {
        throw new Exception();
    }
        void def() throws Exception {
            ghi();
            str+="2";
            ghi();
            str+="3";
        }
        void abc(){
            try{def();}
            catch (Exception e) {str+="1";}
        }
        public static void main(String[] args) {
            Test20 t = new Test20();
            t.abc();
            System.out.println(str);
        }
    }


