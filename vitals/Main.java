package vitals;

public class Main {

    static boolean temperature_range(float temperature){
        if(temperature < 0 || temperature > 45) {
            System.out.println("Temperature is out of range!");
            return false;
        }
        return true;
    }

    static boolean soc_range(float soc){
        if (soc < 20 || soc > 80){
            System.out.println("State of Charge is out of range!");
            return false;
        }
        return true;
    }

    static boolean chargeRate_range(float chargeRate){ 
        if(chargeRate > 0.8) {
            System.out.println("Charge Rate is out of range!");
            return false;
        }
        return true;
    }

    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {

        return (temperature_range(temperature) && soc_range(soc) && chargeRate_range(chargeRate));
    }
    
    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        System.out.println("Some more tests needed");
    }
}
