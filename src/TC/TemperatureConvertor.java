package TC;

public class TemperatureConvertor {

    public  void  convertTemp
            (int temperature, char convertTo)

    {


        if (convertTo == 'F') {
            int temperatureC = temperature;


            int temperatureF = (temperatureC * 9 / 5) + 32;

            System.out.println(temperature + "C = " + temperatureF + "F");

        }


        if (convertTo == 'C') {
            int temperatureF = temperature;

            int temperatureC = (temperatureF - 32) * 5 / 9;
            System.out.println(temperature + "F =" + temperatureC + "C");

        }

    }


    public static void main(String[] args) {
        TemperatureConvertor tc = new TemperatureConvertor();

        tc.convertTemp(0, 'F');

        tc.convertTemp(0, 'C');

    }
}
