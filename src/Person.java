import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;

/**
 * Created by Brittany on 4/11/16.
 */
public class Person implements Comparable{



    String firstName;
    String lastName;
    String countryName;

    Integer cNumber;

    public Person(Integer num, String fName, String lName, String email, String country, String address) {
        firstName = fName;
        lastName = lName;
        countryName = country;
        cNumber = num;
        ipAddress = address;
        emailAddress = email;


    }

    public Integer getcNumber() {
        return cNumber;
    }

    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    String ipAddress;
    String emailAddress;


    public Person() {

    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return String.format("%s %s is from %s", getFirstName(), getLastName(),
                getCountryName());
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return countryName.compareTo(p.countryName);
    }
}