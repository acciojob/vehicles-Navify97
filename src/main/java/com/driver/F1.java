package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "racing", 1); // set the arbitrary values for the Car class
    }

    public void accelerate(int rate){
        int currentSpeed = getCurrentSpeed();
        int newSpeed = currentSpeed + rate; // set the new speed by adding the rate to the current speed

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop(); // stop the car
            changeGear(1); // set the gear as 1
        }
        else if(newSpeed > 0 && newSpeed <= 50) {
            changeGear(1); // set the gear as 1 for speeds between 1-50
        }
        else if(newSpeed > 50 && newSpeed <= 100) {
            changeGear(2); // set the gear as 2 for speeds between 51-100
        }
        else if(newSpeed > 100 && newSpeed <= 150) {
            changeGear(3); // set the gear as 3 for speeds between 101-150
        }
        else if(newSpeed > 150 && newSpeed <= 200) {
            changeGear(4); // set the gear as 4 for speeds between 151-200
        }
        else if(newSpeed > 200 && newSpeed <= 250) {
            changeGear(5); // set the gear as 5 for speeds between 201-250
        }
        else {
            changeGear(6); // set the gear as 6 for speeds greater than 250
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection()); // change the speed and direction
        }
    }
}
