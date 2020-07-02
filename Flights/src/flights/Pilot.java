package flights;

/**
 * A pilot or copilot.
 */
public class Pilot {

    private int id;
    private String lastName;
    private String firstName;
    private String nickName;

    /**
     * Creates a pilot with the specified information.
     * 
     * @param id pilot's employee id
     * @param lastName pilot's last name
     * @param firstName pilot's first name
     * @param nickName pilot's nick name
     */
    public Pilot(int id, String lastName, String firstName, String nickName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.nickName = nickName;
    }

    /**
     * Creates a pilot with the specified information.
     * Sets the pilot's nick name to "none".
     * 
     * @param id pilot's employee id
     * @param lastName pilot's last name
     * @param firstName pilot's first name
     */
    public Pilot(int id, String lastName, String firstName) {
        this(id, lastName, firstName, "none");
    }

    /**
     * Creates a string representation of this pilot's information,
     * formatted for displaying to a human reader.
     * If the pilot has no nick name, the nick name field is not included.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        String res = "";

        res += "ID = " + id;
        res += ", Name = " + firstName + " " + lastName;
        if (!nickName.equals("none")) {
            res += ", Nick Name = " + nickName;
        }

        return res;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }
    
} // end class Pilot
