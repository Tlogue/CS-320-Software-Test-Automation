package contacts.model;

public class Contact {
    // Class representing a contact with basic information
    private final String contactId;  // Make it final to ensure it's not updatable
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor to initialize a new contact
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Getter method for contact ID
    public String getContactId() {
        return contactId;
    }

    // Getter and setter methods for first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (isValidName(firstName)) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Invalid first name");
        }
    }

    // Getter and setter methods for last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (isValidName(lastName)) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name");
        }
    }

    // Getter and setter methods for phone number
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (isValidPhone(phone)) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (isValidAddress(address)) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Invalid address");
        }
    }

    // Private methods for input validation
    private boolean isValidName(String name) {
        return name != null && name.length() <= 10;
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.length() == 10;
    }

    private boolean isValidAddress(String address) {
        return address != null && address.length() <= 30;
    }
}
