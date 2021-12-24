package io.kraftapps.a.codeblocks.expression.methods;

public class SpeedConverter {

    public long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);

    }

    public void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.print("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/1.609) + " mi/h");
        }

    }
}
