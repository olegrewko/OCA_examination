package comAV.inheritance;

public abstract class  Auto  {



    private String producer = "Mercedes";
    private String model = "A180";
    private Engine engineType ;
    private int currentSpeed;
    protected boolean isRunning;



    public Auto(String producer, String model, Engine engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public Auto() {
    }

//    public abstract void energize();

    public static void doSmth(){}

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHour");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

//    protected Engine getEngine () {
//        return Engine;
//    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }
}
