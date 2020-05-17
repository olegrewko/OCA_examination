package Lesson27;

public class Test15 {
   void marafon(int temperature, int temp) throws PNE {
       if(temp > 12) {
           throw  new PNE("Temp bega slishkom vysocy: " + temp);
       }
       if (temperature > 32) {
           throw  new SME();
       }
       System.out.println("Vi probejali marafon");
   }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(40, 8);
        }catch(PNE e){
                System.out.println(e.getMessage());
            }
        finally {
            System.out.println("Gramota");
        }
        }
    }



class PNE extends Exception {
    PNE(String message){
        super(message);
    }
    PNE() {}

}
class SME extends PNE {
    SME(String message){
        super(message);
    }
    SME() {}

}