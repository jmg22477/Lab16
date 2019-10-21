import java.util.Objects;

/**
 * basic Employee to use with Set and Map collections
 * https://docs.google.com/document/d/1THPPB3TNycEtTR80fwr1u-DpVF2Q729jIdjZycx9src/edit?usp=sharing
 * 2016-10-10, 2019-10-15
 * @author John Maxfield
 * @author Josh and Evan
 */
public class Employee {
    private String firstName;  // first name of the employee
    private String lastName;   // last name of the employee
    private String ID;         // employee ID, unique key

    public Employee() {
    }
    public Employee(String firstName, String lastName, String ID){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(ID, employee.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}