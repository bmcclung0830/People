import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class People {

    static HashMap<String, ArrayList<Person>> namesToCountries = new HashMap<>();
    static ArrayList<Person> namesList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, NumberFormatException, IOException, NoSuchMethodException{

        namesToCountries = People.fileWriter();
        Collections.sort(namesList);
        People.filePrinter();
        ReadWriteJson.writeJsonFile();
    }


    public static HashMap<String, ArrayList<Person>> fileWriter() throws FileNotFoundException, NumberFormatException {
        HashMap<String, ArrayList<Person>> namesToCountries = new HashMap<>();

        try {
            File f = new File("people.csv");
            Scanner fileScanner = new Scanner(f);
            String previousCountry = "";
            ArrayList<Person> namesList = null;
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] c = line.split("\\,");
                Person person = new Person(Integer.valueOf(c [0]), c[1], c [2], c [3], c [4], c [5]);
                String country = person.getCountryName();

                //country
                //if the country [country] is the same as the previous [previousCountry]
                //  the object [Person] from the list needs to be added to the same list
                if (! country.equals(previousCountry)) {
                    namesList = new ArrayList<>();
                    if (! previousCountry.isEmpty()) {
                        namesToCountries.put(previousCountry, namesList);
                    }
                }
                namesList.add(person);
                previousCountry = country;

            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops, where's the file?");
            return null;
        }

        return namesToCountries;

    }
    public static void filePrinter() throws FileNotFoundException {
        for (Person person : namesList) {
            System.out.println(person);
        }
    }

}




