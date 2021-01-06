import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class showCountryList {
    public static void main(String[] args) {
        try {
            showCountryList();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void showCountryList() throws IOException {

        File file = new File("countryList.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        ArrayList<String[]> arrayList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(",");

            arrayList.add(arr);
        }
        arrayList.forEach(a -> System.out.print(a[5]+"\t"));

    }
}
