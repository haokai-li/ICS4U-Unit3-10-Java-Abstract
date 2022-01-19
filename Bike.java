/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-20
*
*/

/**
* This is the standard "Bike" program.
*/
public class Bike extends MyVehicle {
    /**
    * Cadence.
    */
    private int cadence;

    /**
    * Read Only Property.
    *
    * @param speedInput speed
    * @param maxSpeedInput maxspeed
    * @param tiresInput tires
    */
    public Bike(final int speedInput,
                final int maxSpeedInput,
                final int tiresInput) {
        super(speedInput, maxSpeedInput, tiresInput);
    }

    /**
    * Getting cadence.
    *
    * @return getCadence
    */
    public int getCadence() {
        return this.cadence;
    }

    /**
    * Setting Cadence.
    *
    * @param cadenceAdd set
    */
    public void setCadence(final int cadenceAdd) {
        this.cadence = cadenceAdd;
        if (this.cadence > 0) {
            accelerate(this.cadence);
        } else if (this.cadence < 0) {
            brake(this.cadence);
        }
    }

    /**
    * Ring Bell.
    *
    * @param ringBellAdd set
    */
    public void ringBell(final String ringBellAdd) {
        if ("y".equals(ringBellAdd)) {
            System.out.println("Bicycle bell on.");
        } else {
            System.out.println("Bicycle bell off.");
        }
    }
}

