public class speedcon {

    public static void main(String[] args) {
        system.out.println(toMilesPerHour(1.5));
        system.out.println(toMilesPerHour(10.25));
        system.out.println(toMilesPerHour(-5.6));
        system.out.println(toMilesPerHour(25.42));
        system.out.println(toMilesPerHour(75.114));




    }


    public static double toMilesPerHour(double kilometersPerHour) {
        if( kilometersPerHour < 0) {
            return -1;
        }else{
            double mph = kilometersPerHour / 1.609;

        return 0;
    }




    }



