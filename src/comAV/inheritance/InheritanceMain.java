package comAV.inheritance;

import static comAV.inheritance.EngineType.*;

public class InheritanceMain {

    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, DIESEL, 900);
        Engine busEngine = new Engine(3.5, DIESEL, 150);
       Auto bus = new Bus("Mercedes", "Sprinter",  busEngine, 75, 12);
        Auto truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 1000);
        Auto car = new ElectricCar("Tesla", "Model S",ELECTRIC, 100500, 4);
//        Auto auto = new Auto("VW", "Polo", busEngine);






        runCar(bus);
        runCar(truck);
        runCar(car);
//        runCar(auto);

        bus.start();
        bus.stop();


    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        if(auto instanceof Truck || auto instanceof Bus){
            FuelAuto fAuto = (FuelAuto) auto;
            fAuto.fuelUp(50);
        }
//        auto.energize();
    }

//        Auto auto = new Auto() {
//            @Override
//            public void energize() {
//
//            }
//        };
//        System.out.println(auto.getProducer());
//        System.out.println(auto.getModel());
    }
