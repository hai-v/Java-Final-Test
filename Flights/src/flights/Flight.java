package flights;

/**
 * A nonstop flight.
 */
public class Flight {

    private String flightNumber;
    private String dayOfWeek;
    private int departureTime;
    private Location destination;
    private Pilot pilot;
    private Pilot copilot;

    /**
     * Creates a flight with both pilot and copilot assigned.
     *
     * @param flightNumber the flight identifier
     * @param dayOfWeek a three-letter string, one of {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
     * @param departureTime an integer from 0 to 2359
     * @param destination the location of this flight's destination
     * @param pilot the pilot of this flight
     * @param copilot the copilot of this flight
     */
    public Flight(String flightNumber, String dayOfWeek, int departureTime, Location destination, Pilot pilot, Pilot copilot) {
        this.flightNumber = flightNumber;
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.destination = destination;
        this.pilot = pilot;
        this.copilot = copilot;
    }

    /**
     * Creates a flight with pilot assigned, copilot unassigned.
     *
     * @param flightNumber the flight identifier
     * @param dayOfWeek a three-letter string, one of {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
     * @param departureTime an integer from 0 to 2359
     * @param destination the location of this flight's destination
     * @param pilot the pilot of this flight
     */
    public Flight(String flightNumber, String dayOfWeek, int departureTime, Location destination, Pilot pilot) {
        this(flightNumber, dayOfWeek, departureTime, destination, pilot, null);
    }

    /**
     * Creates a flight with neither pilot nor copilot assigned.
     *
     * @param flightNumber the flight identifier
     * @param dayOfWeek a three-letter string, one of {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
     * @param departureTime an integer from 0 to 2359
     * @param destination the location of this flight's destination
     */
    public Flight(String flightNumber, String dayOfWeek, int departureTime, Location destination) {
        this(flightNumber, dayOfWeek, departureTime, destination, null);
    }

    /**
     * Creates a string containing this flight's information, 
     * formatted for displaying to a human reader.
     * If this flight has no pilot, this field is omitted; similarly for the copilot.
     *
     * @return the comma-separated string
     */
    @Override
    public String toString() {
        String res = "";

        res += "Flight = " + flightNumber;
        res += ", Day = " + dayOfWeek;
        res += ", Time = " + departureTime;
        res += "\n";
        res += "\tDestination: ";
        res += destination.toString();
        res += "\n";
        res += "\tPilot: ";
        if (hasPilot()) {
            res += pilot.toString();
        }
        else {
            res += "NOT YET ASSIGNED";
        }

        res += "\n";
        res += "\tCo-Pilot: ";

        if (hasCopilot()) {
            res += copilot.toString();
        }
        else {
            res += "NOT YET ASSIGNED";
        }

        return res;
    }

    /**
     * Has a pilot been assigned to this flight?
     * 
     * @return true if this flight has a pilot assigned; false otherwise
     */
    public boolean hasPilot() {
        return pilot != null;
    }

    /**
     * Has a copilot been assigned to this flight?
     * 
     * @return true if this flight has a copilot assigned; false otherwise
     */
    public boolean hasCopilot() {
        return copilot != null;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public Location getDestination() {
        return destination;
    }

    public Pilot getCopilot() {
        return copilot;
    }

    public Pilot getPilot() {
        return pilot;
    }
} // end class Flight

