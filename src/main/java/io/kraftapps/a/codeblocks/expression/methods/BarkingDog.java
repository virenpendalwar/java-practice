package io.kraftapps.a.codeblocks.expression.methods;

public class BarkingDog {

    public boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if((hourOfDay<8 && barking) || (hourOfDay>22&& barking)){
            return true;
        }
        return false;
    }

}
