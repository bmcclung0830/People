import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Created by Brittany on 4/11/16.
 */
public class ReadWriteJson extends Person{

    public static void writeJsonFile() throws IOException{
        JsonSerializer serializer = new JsonSerializer();
        File f = new File("src/people.json");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        String json = serializer.include("*").serialize(People.namesToCountries);
        bw.write(json);


        System.out.println( People.namesToCountries.toString() );
        bw.close();


    }
}
